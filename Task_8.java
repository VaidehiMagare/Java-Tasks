package Java_Tasks;

import java.util.Scanner;

/* Write a Java program to print the multiplication table of a number 
 * entered by the user. For example, if user inputs 5, output should be 5×1 to 5×10.*/

public class Task_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for multiplication table: ");
		int num = sc.nextInt();
		
		for(int j=1; j<11; j++) {
			System.out.println(num + "*" + j + " = " + num * j);
		}
	}
}
