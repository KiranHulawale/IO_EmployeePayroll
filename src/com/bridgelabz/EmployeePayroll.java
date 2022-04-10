package com.bridgelabz;
import java.util.Scanner;

public class EmployeePayroll {

    public static void main(String[] args) {
        EmployeePayroll employee = new EmployeePayroll();
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
int id;
    String name;
    double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}


