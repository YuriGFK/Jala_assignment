package Strings;

public class Q1 {
//Different ways creating a string
	public static void main(String[] args) {
		//Different ways of creating java
		String string = "hello";//method 1
		String message = new String("Hello");//method 2
		char ch[] = {'B','o','n','j','o','u','r'};//method 3 part 1
		String french = new String(ch);//method 3 part 2 
		System.out.println(string);
		System.out.println(message);
		System.out.println(french);
	}

}
