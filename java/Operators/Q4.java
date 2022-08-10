package Operators;

import java.util.Scanner;
//Write a program to find the two numbers equal or not
public class Q4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 'a' value: ");
		int a = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter 'b' value: ");
		int b = scan1.nextInt();
		if(a==b) {
			System.out.println("They are equal");
		}else
			System.out.println("They are unequal");
	}

}
