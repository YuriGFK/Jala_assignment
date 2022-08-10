package Arrays;
import java.util.Scanner;
public class Q11 {
//Write a program to find the common values between two arrays
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of first array:");
		int n = scan.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" element of first array: ");
			int arr=scan1.nextInt();
			array[i]=arr;
		}
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter the size of second array:");
		int n1=scan2.nextInt();
		int[] array1=new int[n1];
		for(int j=0;j<n1;j++) {
			Scanner scan3=new Scanner(System.in);
			System.out.println("Enter "+(j+1)+" element of second array");
			int arr1=scan3.nextInt();
			array1[j]=arr1;
		}
		common(array,n,array1,n1);
	}
	public static void common(int[] array, int n, int[] array1, int n1) {
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n1;j++) {
				if(array[i]==array1[j]) {
					System.out.println("Common value "+array[i]+" at position "+(i+1)+" in first array and "+(j+1)+" in second array");
					count++;
				}
			}
		}
		if(count==0) {
			System.out.println("No common values between the two arrays");
		}
	}
}
