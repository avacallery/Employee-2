package com.avacallery;

//ENCAPSULATE INTO EMPLOYEE CLASS

public class Employee {
    //fields are the blueprints to our objects
    private int baseSalary;
    private int hourlyRate;

    // no need to add all parameters because we are storing the fields above
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or negative.");
        this.baseSalary= baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
