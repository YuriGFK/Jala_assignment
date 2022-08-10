package Loops;

import java.util.Scanner;
//Write a program to print largest number among three numbers.
public class Q5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter second number:");
		int b = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter third number:");
		int c = scan2.nextInt();
		if((a>b)&&(a>c))
			System.out.println("The first number "+a+" is largest");
		else
			if((b>a)&&(b>c))
				System.out.println("The second number "+b+" is largest");
			else
				System.out.println("The third number "+c+" is largest");

	}

}
