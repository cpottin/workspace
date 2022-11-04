package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    private double rate;
    private double hours;

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        this.rate = rate;
        this.hours = hours;
    }
@Override
    public void pay(){
        System.out.println(getName() + " is paid hourly " + (rate * hours));
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee: " +
                " name " + getName() +
                ", hireDate = " + getHireDate() +
                ", hourly rate = " + rate +
                ", hours = " + hours +
                '}';
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes " + (rate * HOURLY_TAX_RATE));
    }
}
