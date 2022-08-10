package Arrays;

import java.util.Scanner;
//Write a function to find the missing number of sorted array of 1 to 100
public class Q19 {

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
		missing(array,n);
	}
	public static void missing(int[] array, int n) {
		for(int i=0;i<n;i++) {
			if(array[i]!=(i+1)) {
				System.out.println("Missing number is "+(i+1)+" at index "+(i+1));
			}
		}
	}
}
