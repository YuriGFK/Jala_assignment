package Loops;

import java.util.Scanner;

//Write a program to find Armstrong number or not
public class Q8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int abc = scan.nextInt();
		int temp,r,c,sum=0;
		temp=abc;
		while(abc>0) {
			r=abc%10;
			c=r*r*r;
			sum=sum+c;
			abc=abc/10;
		}
		abc=temp;
		if(sum==abc)
			System.out.println("The input value "+abc+" is an armstrong number");
		else
			System.out.println("The inputed value "+abc+" is not an armstrong number");

	}

}
