/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 *
 * @author MoaathAlrajab
 */
public class MainClass {

	public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

		// ToDo 7: Create two classes for Freshman and Senior

		// ToDo 8: The senior class should have a minimum of 85 credits

		// ToDo 9: Add a toString method for the Student class

		Freshman freshman = new Freshman("James", (short) 20, 3.5, 12); // name, age, gpa, credits
		Senior senior = new Senior("John", (short) 30, 3.8, 90); // name, age, gpa, credits

		// ToDo 12: Set the gpa of the student using the scanner and user input and then print the output.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter GPA for freshman: ");
		double freshmanGpa = scanner.nextDouble();
		freshman.setGpa(freshmanGpa);

		System.out.print("Enter GPA for senior: ");
		double seniorGpa = scanner.nextDouble();
		senior.setGpa(seniorGpa);

		System.out.println(freshman);
		System.out.println(senior);

		// ToDo 13: add comments and explain your code

		// This class is the entry point for the program.It creates Freshman and Senior student objects,
        // allows the user to set their GPA through input, and then prints their information.
	}
}

