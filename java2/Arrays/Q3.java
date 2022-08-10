package Arrays;
import java.util.Scanner;
public class Q3 {
//Write a program to find the index of an array element

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" element of the array: ");
			int arr= scan1.nextInt();
			array[i]=arr;
		}
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the element whose index is to be found: ");
		int arr1=scan2.nextInt();
		for(int i=0;i<n;i++) {
			if(array[i]==arr1) {
				System.out.println("index of "+arr1+" is: "+i+" and is located at "+(i+1)+" place");
			}
		}

	}

}
