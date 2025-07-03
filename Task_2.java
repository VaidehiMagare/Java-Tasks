package Java_Tasks;

import java.util.Scanner;

/* Write a Java program that accepts two integers from the user and displays their sum. */

public class Task_2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 1st no.: ");
		int a = sc.nextInt();
		
		System.out.println("Enter 1st no.: ");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println("Addition is: "+c);
	}
}
