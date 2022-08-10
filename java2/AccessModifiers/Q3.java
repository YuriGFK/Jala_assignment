package AccessModifiers;
//Create a class with PROTECTED fields and methods. Access these fields and methods from any other class in the same package. Also, Access the PROTECTED fields and methods from child class located in a different package

public class Q3 {

	public static void main(String[] args) {
		Q3a object = new Q3a();
		System.out.println(object.number);
		System.out.println(object.string);
		System.out.println(object.doublemethod());
		System.out.println(object.stringmethod("Jala", " Technologies"));

	}

}
