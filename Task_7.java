package Java_Tasks;

/* Write a Java program to create a simple calculator that performs basic operations (+, –, ×, ÷) 
 * using switch-case. Take two numbers and an operator as input.*/

import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first operand: ");

		int num1 = sc.nextInt();

		
		System.out.println("Enter second operand: ");

		int num2 = sc.nextInt();

		sc.nextLine();
		

		System.out.println("Enter operator ( + | - | * | / ): ");

		String op = sc.nextLine();


		float result = 0;

		switch(op) {

		case "+":

			result = num1 + num2;

			break;

		case "-":

			result = num1 - num2;

			break;

		case "*":

			result = num1 * num2;

			break;

		case "/":

			result = num1 / num2;
			break;

		}
		System.out.println("Result: " + result);
	}

}