package Arrays;
import java.util.Scanner;
public class Q9 {
	//Write a function to reverse an array of integer values
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = s.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" element of array:");
			int arr = s1.nextInt();
			array[i]=arr;
		}
		for(int j=0;j<n;j++) {
			System.out.println(array[j]);
		}
		System.out.println("_____________");
		reverse(array,n);
	}
	public static void reverse(int[] array,int n) {
		int t;
		for(int i=0;i<n/2;i++) {
			t=array[i];
			array[i]=array[n-1-i];
			array[n-i-1]=t;
		}
		for(int k=0;k<n;k++) {
			System.out.println(array[k]);
		}
	}

}
