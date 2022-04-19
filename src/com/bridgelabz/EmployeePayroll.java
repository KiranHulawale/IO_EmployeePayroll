package com.bridgelabz;

import java.util.*;
import java.util.Scanner;


public class EmployeePayroll {

    private static List<EmployeeServices> empPayRollList;
    private static Scanner sc = new Scanner(System.in);

    public EmployeePayroll(List<EmployeeServices> empPayRollList) {
        this.empPayRollList = empPayRollList;
    }

    public static void main(String[] args) {
        ArrayList<EmployeeServices> empPayRollList = new ArrayList<EmployeeServices>();
        EmployeePayroll empPayRollService = new EmployeePayroll(empPayRollList);

        empPayRollService.readData();

        empPayRollService.writeData();

    }

    private static void readData() {
        System.out.println("Please Enter the following details :");
        System.out.println("Enter ID");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name :");
        String name = sc.nextLine();
        System.out.println("Enter Salary :");
        double salary = sc.nextDouble();

        EmployeeServices empPayRollObject = new EmployeeServices(id, name, salary);
        empPayRollList.add(empPayRollObject);
    }

    private void writeData() {
        System.out.println("Employee Pay Roll Data : \n" + empPayRollList.get(0).toString());
    }

}

