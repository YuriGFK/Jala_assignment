package Strings;
import java.util.Scanner;
public class Q12 {
//Converting Numbers to Strings with valueOf()
	public static void main(String[] args) {
		// Converting Numbers to Strings with valueOf()
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = scan.nextInt();
		String string = String.valueOf(number);
		System.out.println(number+100);
		System.out.println(string+100);

	}

}
