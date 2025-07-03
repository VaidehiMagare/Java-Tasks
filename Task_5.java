package Java_Tasks;

import java.util.Scanner;

/* Write a Java program to check whether a given string is a palindrome.*/

public class Task_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your str to check palindrome:- ");
		String str = sc.next();
		
		char c[] = str.toCharArray();
		
		if (palin(str)) {
			System.out.println(str+ " string is a palindrome!");
		}
		else {
			System.out.println(str+ " string is not a palindrome!!");
		}
	}
	
	public static boolean palin(String s) {
		int left=0, right= s.length()-1;
		
		while (left< right) {
			if (s.charAt(left) != s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
