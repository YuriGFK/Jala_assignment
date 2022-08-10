package Arrays;
import java.util.Scanner;
public class Q2 {
//Write a function to calculate the average value of an array of integers
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			Scanner scan1= new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" element of array:");
			int arr = scan1.nextInt();
			array[i]=arr;
		}
		avg(array,n);
	}
	public static void avg(int[] array,int n) {
		int sum=0,average;
		for(int i=0;i<n;i++) {
			sum=sum+array[i];
		}
		average=sum/n;
		System.out.println("Average of the elements of array: "+average);
	}

}
