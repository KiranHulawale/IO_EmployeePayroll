package com.bridgelabz;

public class EmployeeServices {
        private int id;
        private String name;
        private double salary;

        public EmployeeServices(int id, String name, double salary) {
            this.id = this.id;
            this.name = this.name;
            this.salary = this.salary;
        }

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

        public String toString()
        {
            return "id="+id+", name="+name+", salary="+salary;
        }
}
