package JavaBasics;
// Define the local and Global variables with the same name and print both variables and understand the scope of the variables
public class Q5 {
	static int n=10;
	public static void main(String[] args) {
		System.out.println(n + " This is global variable. They can be accessed by all the functions of the program");
		local();
		System.out.println("Variable names are same, in this case i.e. n");
	}
	public static void local() {
		int n=11;
		System.out.println(n + " This is local variable which are accessible only where they are declared");
	}

}
