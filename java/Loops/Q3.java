package Loops;

import java.util.Scanner;
//Program to equal operator and not equal operators

public class Q3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 'a' value: ");
		int a = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter 'b' value: ");
		int b = scan1.nextInt();
		if(a==b)
			System.out.println("The condtion is true for equal to operator");
		else
			if(a!=b)
				System.out.println("The condition is true for not equal operator");

	}

}
