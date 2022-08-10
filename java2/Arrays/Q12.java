package Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Q12 {
//Write a method to remove duplicate elements from an array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n=scan.nextInt();
		int[] array= new int[n];
		for(int i=0;i<n;i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" element of the array");
			int arr = scan1.nextInt();
			array[i]=arr;
		}
		duplicatedelete(array,n);
	}
	public static void duplicatedelete(int[] array, int n) {
		System.out.println("....................................");
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();// as we know LinkedHashSet doesn't allow duplicate elements and it will make the elements in sorted manner
		for(int i=0;i<n;i++) {
			set.add(array[i]);
		}
		System.out.println(set);
	}
}
