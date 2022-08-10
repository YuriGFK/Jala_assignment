package Operators;
//Write a function for arithmetic operators(+,-,*,/)
public class Q1 {
	public static void main(String[] args) {
		int sum = Add(20,56);
		System.out.println(sum);
		int subtraction = Sub(50,4);
		System.out.println(subtraction);
		int Multiplication = Multi(2,100);
		System.out.println(Multiplication);
		int Division = Div(256,2);
		System.out.println(Division);
	}
	public static int Add(int a, int b) {
		return(a+b);
	}
	public static int Sub(int c, int d) {
		return(c-d);
	}
	public static int Multi(int e, int f) {
		return(e*f);
	}
	public static int Div(int g, int h) {
		return(g/h);
	}

}
