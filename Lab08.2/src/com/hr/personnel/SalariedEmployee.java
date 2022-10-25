package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    private double salary;

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: " +
                " name = " + getName()+
                ", hireDate = " + getHireDate() +
                ", salary=" + salary +
                '}';
    }
}
