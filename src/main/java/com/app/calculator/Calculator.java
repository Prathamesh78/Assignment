package com.app.calculator;
import java.util.Scanner;

public class Calculator {
		// TODO Auto-generated method stub
	    // Method to add two integers
	    public int sum(int a, int b) {
	        return a + b;
	    }

	    // Method to subtract two integers
	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    // Method to multiply two integers
	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    // Method to divide two integers (returns integer division)
	    public int divide(int a, int b) {
	        if (b == 0) {
	            throw new IllegalArgumentException("Cannot divide by zero");
	        }
	        return a / b;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the first input integer
	        System.out.print("Enter the first integer: ");
	        int num1 = scanner.nextInt();

	        // Read the second input integer
	        System.out.print("Enter the second integer: ");
	        int num2 = scanner.nextInt();

	        // Create an instance of the Calculator class
	        Calculator calculator = new Calculator();

	        // Call the methods and print the output
	        System.out.println("Sum: " + calculator.sum(num1, num2));
	        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
	        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
	        try {
	            System.out.println("Division: " + calculator.divide(num1, num2));
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }

	        // Close the scanner
	        scanner.close();
	    }
}