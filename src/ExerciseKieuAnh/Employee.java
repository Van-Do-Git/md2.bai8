package ExerciseKieuAnh;

public abstract class Employee {
    protected int employeeCode, employeeAge;
    protected String employeePhone;
    protected String employeeName;
    protected String employeeEmail;

    public Employee() {
        employeeName = "";
        employeeAge = 0;
        employeePhone = "";
        employeeCode = 0;
        employeeEmail = "";
    }

    public Employee(String _employeeName, int _employeeAge,
                    String _employeePhone, int _employeeCode,
                    String _employeeEmail) {
        employeeName = _employeeName;
        employeeAge = _employeeAge;
        employeePhone = _employeePhone;
        employeeCode = _employeeCode;
        employeeEmail = _employeeEmail;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public abstract double calculateSalary();


    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode=" + employeeCode +
                ", employeeAge=" + employeeAge +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                '}';
    }
}
