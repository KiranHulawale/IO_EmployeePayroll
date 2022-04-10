package com.bridgelabz;
import java.util.Scanner;

public class EmployeePayroll {

    public static void main(String[] args) {
        EmployeeServices employee = new EmployeeServices();
        Scanner scan = new Scanner(System.in);

        System.out.print(" Please enter the name of the employee: ");
        String name = scan.next();

        System.out.print(" Please enter the id of the employee: ");
        int id = scan.nextInt();

        System.out.print(" Please enter the salary of the employee: ");
        double salary = scan.nextDouble();

        employee.setName(name);
        employee.setId(id);
        employee.setSalary(salary);

        System.out.println(employee);

        scan.close();
    }

}

