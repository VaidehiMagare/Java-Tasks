package Java_Tasks;

import java.util.Scanner;

/* Write a Java program that takes an array of integers and a key from the user, 
 * and searches for that key in the array using a loop. If found, display its index.*/

public class Task_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements in the array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the key to find: ");
		int x = sc.nextInt();
		
		int flag=0;		
		for(int j=0; j<n; j++) {
			if (x==arr[j]) {
				System.out.println(x+ " is present at index "+j);
				flag=1;
			}
		}
		if (flag==0) {
			System.out.println(x+ " not found!!");
		}
	}

}