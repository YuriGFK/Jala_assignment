package Arrays;

import java.util.Scanner;

public class Q17 {
//Write a method to verify if the array contains two specified elements(12,23)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = scan.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" elements of array:");
			int arr = scan1.nextInt();
			array[i]=arr;
		}
		check(array,n);
	}
	public static void check(int[] array, int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(array[i]==12) {
				System.out.println("yes it contains value 12");
				count++;
			}
			if(array[i]==23) {
				System.out.println("yes it contains value 23");
				count++;
			}
			
		}
		if(count==0)
			System.out.println("No it doesn't contain 12 and 23");
	}

}
