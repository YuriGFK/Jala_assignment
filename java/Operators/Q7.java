package Operators;

import java.util.Scanner;
//Print the smaller and larger number
public class Q7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 'a' value: ");
		int a = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter 'b' value: ");
		int b = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter 'c' value: ");
		int c = scan2.nextInt();
		int greatest = 0, smallest=0;
		if((a>b) && (a>c))
			greatest = a;
		else
			if((b>a) && (b>c))
				greatest = b;
			else
				if((c>a) && (c>b))
					greatest = c;
		System.out.println("Greater value among these is "+ greatest);
		if((a<b) && (a<c))
			smallest = a;
		else
			if((b<a) && (b<c))
				smallest = b;
			else
				if((c<a) && (c<b))
					smallest = c;
		System.out.println("Smallest value is "+ smallest);
	}


}
