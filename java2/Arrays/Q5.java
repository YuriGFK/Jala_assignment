package Arrays;
import java.util.Scanner;
public class Q5 {
//Write a function to remove a specific element from an array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=scan.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			Scanner scan1=new Scanner(System.in);
			System.out.println("Enter the "+(i+1)+" element:");
			int arr = scan1.nextInt();
			array[i]=arr;
		}
		delete(array,n);
	}
	public static void delete(int[] array,int n) {
		Scanner scan2= new Scanner(System.in);
		System.out.println("Enter the element that needs to be deleted:");
		int arr1=scan2.nextInt();
		int index=0;
		for(int i=0;i<n;i++) {
			if(array[i]==arr1) {
				index=i;
			}
		}
		for(int j=index;j<n-1;j++) {
			array[j]=array[j+1];
		}
		for(int k=0;k<n-1;k++) {
			System.out.println(array[k]);
		}
	}

}
