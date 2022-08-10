package Arrays;
import java.util.Scanner;
public class Q8 {
//Write a function to find the minimum and maximum value of an array
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int[] array= new int[n];
		for(int i=0;i<n;i++) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" element of array");
			int arr = s1.nextInt();
			array[i]=arr;
		}
		for(int l=0;l<n;l++) {
			System.out.println(array[l]);
		}
		maxmin(array,n);
		
	}
	public static void maxmin(int[] array, int n) {
		int biggest,smallest;
		biggest=array[0];
		for(int j=1;j<n;j++) {
			if(array[j]>biggest) {
				biggest=array[j];
			}
		}
		System.out.println("Biggest element in array: "+biggest);
		smallest=array[0];
		for(int k=1;k<n;k++) {
			if(array[k]<smallest) {
				smallest=array[k];
			}
		}
		System.out.println("Smallest element in array: "+smallest);
		
	}
}
