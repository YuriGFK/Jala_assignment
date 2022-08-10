package Arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q18 {
//Write a program to remove the duplicate elements and return the new array

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
		duplicate(array,n);
	}
	public static void duplicate(int[] array, int n) {
		LinkedHashSet<Integer> array1= new LinkedHashSet<Integer>();
		for(int i=0;i<n;i++) {
			array1.add(array[i]);
		}
		System.out.println(".......................");
		System.out.println(array1);
		
	}

}
