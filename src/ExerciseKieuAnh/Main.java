package ExerciseKieuAnh;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new EmployeeFulltime(
                "Cuong", 15,
                "1652", 656,
                "Cuong Mail", 500000,
                200000, 5000000);
        Employee employee2 = new EmployeeFulltime(
                "Hanh", 5,
                "16sdf2", 556,
                "Hanh Mail", 700000,
                500000, 6000000);
        Employee employee3 = new EmployeeParttime(
                "Van", 18,
                "23425", 234,
                "Van Mail", 210);
        Employee employee4 = new EmployeeParttime(
                "Binh", 15,
                "23sdf25", 634,
                "BInh Mail", 180);
        Manager vanDX = new Manager();
        vanDX.addNewEmployee(employee1);
        System.out.println(employee1);
        vanDX.addNewEmployee(employee2);
        vanDX.addNewEmployee(employee3);
        vanDX.addNewEmployee(employee4);
        vanDX.showAllEmployee();
        System.out.println();
        Arrays.sort(Manager.listEmployee, vanDX);
        vanDX.showAllEmployee();
    }

}
