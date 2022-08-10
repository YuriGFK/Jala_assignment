package Operators;
//Write a method for increment and decrement operators(++, --)

public class Q2 {
	public static void main(String[] args) {
		int a=10;
		int incrementedvalue = increment(a);
		System.out.println(incrementedvalue);
		int b=10;// a and b values are same
		int decrementedvalue = decrement(b);
		System.out.println(decrementedvalue);
	}
	public static int increment(int x) {
		x++;//increment operator
		return x;
	}
	public static int decrement(int y) {
		y--;//decrement operator
		return y;
	}

}
