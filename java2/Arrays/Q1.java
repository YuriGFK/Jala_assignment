package Arrays;
import java.util.Scanner;
public class Q1 {
// Write a function to add integer values of an array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter the "+(i+1)+" element of array");
			int arr = scan1.nextInt();
			array[i]=arr;
		}
		add(array,n);
	}
	public static void add(int[] array,int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+array[i];
		}
		System.out.println("The sum of elements of array :"+sum);
	}
	

}
