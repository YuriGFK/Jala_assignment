package Loops;

import java.util.Scanner;

//Write a program to find the prime or not
public class Q9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int prime = scan.nextInt();
		int count=0;
		for(int i=1; i<=prime;i++) {
			if(prime%i==0)
				count++;
		}
		if(count==2)
			System.out.println("The entered number is prime number");
		else
			System.out.println("Not a prime number");

	}

}
