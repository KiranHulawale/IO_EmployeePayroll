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

        empPayRollService.writeData("Console");

    }

    public static void readData() {
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

    public void writeData(String destination) {
        if (destination.equals("Console"))
            System.out.println("Employee Pay Roll Data : \n" + empPayRollList.get(0).toString());
        else if (destination.equals("File"))
            new EmployeePayRollFileService().writeData(empPayRollList);
    }

    public int noOfEntries(String destination) {
        if (destination.equals("Console"))
            return empPayRollList.size();
        else if (destination.equals("File"))
            return new EmployeePayRollFileService().noOfEntries();
        return 0;
    }

    public void printData(String destination) {
        if (destination.equals("Console"))
            for(EmployeeServices e : empPayRollList)
            {
                System.out.println(e.toString()+"\n");
            }
        else if (destination.equals("File"))
            new EmployeePayRollFileService().printData();


    }
}

