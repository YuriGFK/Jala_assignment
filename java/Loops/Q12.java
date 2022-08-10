package Loops;
//Print gender (Male/Female) program according to given M/F using switch

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Gender:");
		String gender = scan.nextLine();
		switch(gender) {
		case "male":
			System.out.println("Entered gender is male");
			break;
		case "female":
			System.out.println("Entered gender is female");
			break;
		}

	}

}
