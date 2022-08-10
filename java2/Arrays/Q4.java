package Arrays;
import java.util.Scanner;
public class Q4 {
//Write a function to test if array contains a specific value
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" element of array: ");
			int arr = scan1.nextInt();
			array[i]=arr;
		}
		test(array,n);
	}
	public static void test(int[] array,int n) {
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter the element value to check it's presence:");
		int arr1 = scan2.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr1==array[i]) {
				System.out.println("It is present in the array");
				count++;
			}
		}
		if(count==0)
			System.out.println("Not present");
	}
}
