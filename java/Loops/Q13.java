package Loops;
//Program for multiple if else statement(Largest number in 10,20 and 30)
public class Q13 {
	public static void main(String[] args) {
		int a=10, b=20, c=30;//given in the question 
		if((a>b)&&(a>c))
			System.out.println(a+" is largest among given number");
		else
			if((b>a)&&(b>c))
				System.out.println(b+" is largest among given number");
			else
				System.out.println(c+" is largest");

	}

}
