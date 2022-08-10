package Arrays;
import java.util.Scanner;
public class Q6 {
//Write a function to copy an array to another array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = scan.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" element of array:");
			int arr = scan1.nextInt();
			array[i]=arr;
		}
		int[] array1=copy(array,n);
		System.out.println("Copy of array:");
		for(int j=0;j<n;j++) {
			System.out.println(array1[j]);
		}
	}
	public static int[] copy(int[] array,int n) {
		return array;
	}

}
