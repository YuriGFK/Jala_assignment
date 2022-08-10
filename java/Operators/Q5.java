package Operators;
//Programs on Logical AND,OR operator and Logical NOT
public class Q5 {
	public static void main(String[] args) {
		int subject1=20, subject2=60;
		if((subject1>=35) && (subject2>=35)) { // &&= AND operator
			System.out.println("The condition is true");
		}else
			System.out.println("The condition is false");
		if((subject1>=35) || (subject2>=35)) { // || = OR operator
			System.out.println("The condition is true");
		}else
			System.out.println("The condition is false");
	}

}
