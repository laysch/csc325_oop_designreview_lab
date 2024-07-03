package com.mycompany.csc325_oop_designreview_lab;

/**
 * This class represents a Freshman student, inheriting properties from the Student class.
 */
public class Freshman extends Student { // ToDo 7: Create two classes for Freshman and Senior

    // Field to store the number of credits completed by the Freshman student
    private int credits;

    /**
     * Constructor for the Freshman class. Takes name, age, GPA, and credits as arguments.
     *
     * @param name  The student's name
     * @param age   The student's age
     * @param gpa   The student's GPA
     * @param credits The number of credits completed by the student
     */
    public Freshman(String name, short age, double gpa, int credits) {
        super(name, age, gpa);
        this.credits = credits;
    }

    // ToDo 10: Add a toString method for the Freshman class
    /**
     * Overrides the toString method from the Student class to provide a Freshman-specific representation.
     * Includes the number of credits completed in the output.
     *
     * @return A string representation of the Freshman student including name, age, GPA, and credits.
     */
    @Override
    public String toString() {
        return "Freshman{name=" + getName() + ", age=" + getAge() + ", gpa=" + getGpa() + ", credits=" + credits + "}";
    }
}
