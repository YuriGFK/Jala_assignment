package Static;
//Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method.
public class Q1 {
	static int number=100;
	static String message="Hi";
	public static void main(String[] args) {
		int number1=200;
		String message1="Hello";
		staticmethod();
		staticmethod2();
		instancemethod(number1);
		instancemethod2(String msg);
	}
	public static void staticmethod() {
		System.out.println(number);
	}
	public static void staticmethod2() {
		System.out.println(message);
	}
	public void instancemethod(int num) {
		System.out.println(num);
	}
	public void instancemethod2(String msg) {
		System.out.println(msg);
	}

}
