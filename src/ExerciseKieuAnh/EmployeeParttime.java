package ExerciseKieuAnh;

public class EmployeeParttime extends Employee {
    private double timeWork;

    public EmployeeParttime() {
        super();
        timeWork = 0;
    }

    public EmployeeParttime(String _employeeName, int _employeeAge,
                            String _employeePhone, int _employeeCode,
                            String _employeeEmail, double timeWork) {
        super(_employeeName, _employeeAge,
                _employeePhone, _employeeCode,
                _employeeEmail);
        this.timeWork = timeWork;
    }

    public double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(double timeWork) {
        this.timeWork = timeWork;
    }


    @Override
    public double calculateSalary() {
        return timeWork * 100000;
    }

    @Override
    public String toString(){
        return "\tName: " + employeeName +
                "\tAge: " + employeeAge +
                "\tCode: " + employeeCode +
                "\tPhone: " + employeePhone +
                "\tEmail: " + employeeEmail +
                "\tTimework: " + timeWork +
                "\tSalary: " + calculateSalary();
    }
}
