package Arrays;
import java.util.Scanner;
public class Q10 {
//Write a function to find the duplicate values of an array
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = s.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" element of the array:");
			int arr = s1.nextInt();
			array[i]=arr;
		}
		duplicate(array,n);
		
	}
	public static void duplicate(int[] array,int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(array[i]==array[j]) {
					System.out.println("Duplicate elements are: "+array[i]+" , "+array[j]+" at position "+(i+1)+ " , "+(j+1));
					count++;
				}
			}
		}
		if(count==0)
			System.out.println("No duplicate elements");
	}

}
