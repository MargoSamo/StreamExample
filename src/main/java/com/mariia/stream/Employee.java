package com.mariia.stream;


public class Employee {
    public int salary;
    public int years;

    public Employee(int salary, int years) {
        this.salary = salary;
        this.years = years;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", years=" + years +
                '}';
    }
}
