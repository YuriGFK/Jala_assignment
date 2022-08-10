package Strings;
//Splitting strings with split()
public class Q11 {

	public static void main(String[] args) {
		//Splitting strings with split()
		String string = "Jala-Academy";
		String[] arr = string.split("-");
		for(String a : arr) {
			System.out.println(a);
		}

	}

}
