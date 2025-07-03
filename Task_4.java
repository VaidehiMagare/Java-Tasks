package Java_Tasks;

import java.util.Scanner;

/* Write a Java program to calculate the factorial of a given positive integer. */

public class Task_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur no.: ");
		int x = sc.nextInt();
		
		int y= fact(x);
		System.out.println("Factorial of " + x+" is:- " + y);
	}
	
	public static int fact(int n) {
		if (n==0 || n==1){
			return 1;
		}
		else {
			return n* fact(n-1);
		}
	}
}
