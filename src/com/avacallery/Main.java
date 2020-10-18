package com.avacallery;

public class Main {

    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    // we don't want our methods to have too many parameters
    // if you're constantly calling methods and passing so many arguments, that is procedural programming
    // avoid fat methods and fat classes
    // programs written this way are harder to maintain because it is harder to find where to change
    // lack of reusability

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
