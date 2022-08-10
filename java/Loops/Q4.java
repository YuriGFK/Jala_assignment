package Loops;

import java.util.Scanner;
//Write a program to print the odd and even numbers.
public class Q4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the noumber until which you want even/odd number: ");
		int n = scan.nextInt();
		for(int i=2; i<=n; i+=2) {
			System.out.println("Even number till "+ n+ ": "+i);
		}
		for(int j=1; j<=n; j+=2) {
			System.out.println("Odd number till "+n+": "+j);
		}
		

	}

}
