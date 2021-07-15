package ExerciseKieuAnh;

import java.util.Comparator;

public class Manager implements Comparator<Employee> {
    public static Employee[] listEmployee = new Employee[0];

    public Manager() {
    }

    public void addNewEmployee(Employee newEmployee) {
        int newLengt = listEmployee.length + 1;
        Employee [] newListEmployee = new Employee[newLengt];
        for (int i = 0; i < listEmployee.length; i++) {
            newListEmployee[i] = listEmployee[i];
        }
        newListEmployee[listEmployee.length] = newEmployee;
        listEmployee = newListEmployee;
    }


    public double calculateAverageSalary() {
        int lengtofList = listEmployee.length;
        double sum = 0;
        double averageSalary;
        for (Employee employee : listEmployee) {
            sum += employee.calculateSalary();
        }
        averageSalary = sum / lengtofList;
        return averageSalary;
    }

    public String listOfLowerAverageSalary() {
        double averageSalary = calculateAverageSalary();
        StringBuilder result = new StringBuilder();
        for (Employee employee : listEmployee) {
            if (employee instanceof EmployeeFulltime) {
                if (employee.calculateSalary() < averageSalary) {
                    result.append("\n").append(employee.toString());
                }
            }
        }
        return result.toString();
    }

    public double totalOfAllEmployeeParttime() {
        double sum = 0;
        for (Employee employee : listEmployee) {
            if (employee instanceof EmployeeParttime)
                sum += employee.calculateSalary();
        }
        return sum;
    }

    public void showAllEmployee() {
        for (Employee employee : listEmployee) {
            System.out.println(employee);
        }
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.calculateSalary() > o2.calculateSalary())
            return 1;
        else if (o1.calculateSalary() < o2.calculateSalary())
            return -1;
        else return 0;
    }
}
