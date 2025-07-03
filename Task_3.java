package Java_Tasks;

import java.util.Scanner;

/*Write a Java program to check whether a given number is even or odd. 
 * Accept a number as input and print whether it's even or odd. */

public class Task_3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur desired number to categorize into even or odd: ");
		int x = sc.nextInt();
		
		if (x%2 == 0) {
			System.out.println(x+" is an even number!!!");
		}
		else {
			System.out.println(x+" is an odd number!!");
		}
		
	}
}
