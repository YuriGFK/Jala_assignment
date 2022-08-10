package Arrays;
import java.util.Scanner;
public class Q16 {
// Write a function to get the difference of largest and smallest value
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n = scan.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" elements of array:");
			int arr = scan1.nextInt();
			array[i]=arr;
		}
		difference(array,n);
	}
	public static void difference(int[] array, int n) {
		int largest,smallest;
		largest=array[0];
		for(int i=1;i<n;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		if(largest==array[0])
			smallest=array[1];
		else
			smallest=array[0];
		for(int j=1;j<n;j++) {
			if(array[j]<smallest)
				smallest=array[j];
		}
		System.out.println("Difference is "+(largest-smallest));
	}

}
