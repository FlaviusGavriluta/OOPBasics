package org.example;

public class Employee {
    private int id;
    private String name;
    private String dob;
    private boolean senior;
    private double salary;
    private static int counter = 0;

    public Employee(String name, String dob, boolean senior, double salary) {
        this.id = counter;
        counter++;
        this.name = name;
        this.dob = dob;
        this.senior = senior;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void promoteToSenior() {
        this.senior = true;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", senior=" + senior +
                ", salary=" + salary +
                '}';
    }
}
