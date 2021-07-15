package ExerciseKieuAnh;

public class EmployeeFulltime extends Employee {
    private double bonusAmount, fineAmount, basicSalary;

    public EmployeeFulltime() {
        super();
        basicSalary = 0;
        fineAmount = 0;
        basicSalary = 0;
    }

    public EmployeeFulltime(String _employeeName, int _employeeAge,
                            String _employeePhone, int _employeeCode,
                            String _employeeEmail, double _bonusAmount,
                            double _fineAmount, double _basicSalary) {
        super(_employeeName, _employeeAge,
                _employeePhone, _employeeCode,
                _employeeEmail);
        bonusAmount = _bonusAmount;
        basicSalary = _basicSalary;
        fineAmount = _fineAmount;
    }

    public double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + (bonusAmount - fineAmount);
    }

    @Override
    public String toString(){
        return "\tName: " + employeeName +
                "\tAge: " + employeeAge +
                "\tCode: " + employeeCode +
                "\tPhone: " + employeePhone +
                "\tEmail: " + employeeEmail +
                "\tBasicSalary: " + basicSalary +
                "\tSalary: " + calculateSalary();
    }
}
