package Arrays;
import java.util.Scanner;
public class Q13 {
//Write a method to find the second largest number in an array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = scan.nextInt();
		int[] array= new int[n];
		for(int i=0;i<n;i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" element of array");
			int arr=s.nextInt();
			array[i]=arr;
		}
		secondlargest(array,n);
	}
	public static void secondlargest(int[] array, int n) {
		int largest,secondlargest;
		largest=array[0];
		for(int i=1;i<n;i++) {
			if(largest<array[i]) {
				largest=array[i];
			}
		}
		System.out.println(largest+" is largest");
		if(largest==array[0])
			secondlargest=array[1];
		else
			secondlargest=array[0];
		for(int j=1;j<n;j++) {
			if(array[j]>secondlargest && array[j]!=largest)
				secondlargest=array[j];
		}
		System.out.println(secondlargest+" is second largest");
	}
}
