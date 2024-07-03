package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student { // ToDo 7: Create two classes for Freshman and Senior

    private int credits;

    // ToDo 8: The senior class should have a minimum of 85 credits
    /**
     * Constructor for the Senior class. Takes name, age, GPA, and credits as arguments.
     * Ensures the credits are at least 85, throwing an exception otherwise.
     *
     * @param name  The student's name
     * @param age   The student's age
     * @param gpa   The student's GPA
     * @param credits The number of credits completed by the student
     * @throws IllegalArgumentException if credits are less than 85
     */
    public Senior(String name, short age, double gpa, int credits) {
        super(name, age, gpa);
        if (credits < 85) {
            throw new IllegalArgumentException("A senior must have at least 85 credits.");
        }
        this.credits = credits;
    }
    // ToDo 11: Add a toString method for the Senior class
    /**
     * Overrides the toString method from the Student class to provide a Senior-specific representation.
     * Includes the number of credits completed in the output.
     *
     * @return A string representation of the Senior student including name, age, GPA, and credits.
     */
    @Override
    public String toString() {
        return "Senior{name=" + getName() + ", age=" + getAge() + ", gpa=" + getGpa() + ", credits=" + credits + "}";
    }
}
