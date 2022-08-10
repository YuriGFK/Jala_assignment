package Loops;

import java.util.Scanner;

//Write a program to palindrome or not.
public class Q10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int palindrome = scan.nextInt();
		int temp=palindrome,r,sum=0;
		while(palindrome>0) {
			r=palindrome%10;
			sum=sum*10+r;
			palindrome=palindrome/10;
		}
		palindrome=temp;
		if(sum==palindrome)
			System.out.println("The entered number is palindrome number");
		else
			System.out.println("Not a palindrome number");

	}

}
