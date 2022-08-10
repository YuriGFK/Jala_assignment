package Arrays;
import java.util.Scanner;
public class Q7 {
// Write a function to insert an element at a specific position in the array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = scan.nextInt();
		int[] array = new int[n+1];
		for(int i=0;i<n;i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" element of array:");
			int arr=scan1.nextInt();
			array[i]=arr;
		}
		enterspecific(array,n);
	}
	public static void enterspecific(int[] array,int n) {
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the index at which you want to insert:");
		int index=scan2.nextInt();
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter the element you want to insert at that index:");
		int arr1= scan3.nextInt();
		for(int i=(n-1);i>=(index-1);i--) {
			array[i+1]=array[i];
		}
		array[index-1]=arr1;
		System.out.println("After inserting");
		for(int j=0;j<=n;j++) {
			System.out.println(array[j]);
		}
	}

}
