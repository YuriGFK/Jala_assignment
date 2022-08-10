package JavaBasics;

import java.util.Scanner;
//Write a function to print your name and call the function from main method
public class Q6 {
	public static void main(String[] args) {
		yourname();
	}
    public static void yourname() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter your name: ");
    	String user_input = scan.nextLine();
    	System.out.println("Your name is : "+ user_input);
    }

}
