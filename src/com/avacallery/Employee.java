package com.avacallery;

//ENCAPSULATE INTO EMPLOYEE CLASS

public class Employee {
    //fields are the blueprints to our objects
    public int baseSalary;
    public int hourlyRate;

    // no need to add all parameters because we are storing the fields above
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

}
