package AccessModifiers;
//Create a class with PRIVATE fields, private method and a main method. Print the fields in main method. Call the private method in main method. Create a sub class and try to access the private fields and methods from sub class.

public class Q1 {
	private  String name="Rishabh";
	private  int age=21;
	private static void method() {
		System.out.println("Hello Jala academy");
	}
	public static void main(String[] args) {
		Q1 obj = new Q1();
		System.out.println(obj.name);
		System.out.println(obj.age);
		method();
	}

}
