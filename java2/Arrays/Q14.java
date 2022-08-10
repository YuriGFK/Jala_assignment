package Arrays;
import java.util.Scanner;
public class Q14 {
//Write a method to find the second largest number in an array
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n= scan.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter "+(i+1)+" elements of array:");
			int arr = s.nextInt();
			array[i]=arr;
		}
		evenodd(array,n);
	}
	public static void evenodd(int[] array, int n) {
		int count=0,count1=0;
		for(int i=0;i<n;i++) {
			if(array[i]%2==0) {
				count++;	
			}
			if(array[i]%2!=0) {
				count1++;
			}
		}
		System.out.println("No. of even elements: "+count);
		System.out.println("No. of odd elements:"+count1);
		if(count==0)
			System.out.println("No even elements");
		if(count1==0)
			System.out.println("No odd elements");
	}

}
