package com.hr.personnel;

import gov.irs.TaxPayer;

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

    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + salary );
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

    @Override
    public TaxPayer payTaxes() {
        System.out.println(getName() + " paid taxes " + (salary *SALARIED_TAX_RATE));
        return null;
    }
}
