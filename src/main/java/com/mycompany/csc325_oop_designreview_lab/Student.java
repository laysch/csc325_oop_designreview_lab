/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human { // ToDo 1: Make this class a child of Human

    // ToDo 3: Add a field for GPA and create a setter and a getter
    private double gpa;

    // ToDo 6: Fix the constructor of the Student class
    public Student(String name, short age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    // ToDo 9: Add a toString method for the Student class
    @Override
    public String toString() {
        return "Student{name=" + getName() + ", age=" + getAge() + ", gpa=" + gpa + "}";
    }

    // Inherited methods from Human class (getAddress, setAddress) remain unchanged.
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    /**
     * Setter method to modify the student's GPA.
     *
     * @param gpa The new GPA value
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
