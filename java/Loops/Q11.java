package Loops;

import java.util.Scanner;

//Program to check whether a number is EVEN or ODD using switch
public class Q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		switch(num%2){
			case 0:
				System.out.println("Entered number is even");
			    break;
			case 1:
				System.out.println("Entered number is an odd number");
				break;
		}

	}

}
