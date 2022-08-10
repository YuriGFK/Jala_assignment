package JavaBasics;

import java.util.Scanner;
//Write a program to print your name.
public class Q2 {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("Enter your name:");
		String user_input_name = scann.nextLine();
		System.out.println("Your name is ");
		System.out.print(user_input_name);
	}

}
