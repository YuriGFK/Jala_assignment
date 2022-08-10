package AccessModifiers;
////Create a class with PROTECTED fields and methods. Access these fields and methods from any other class in the same package. Also, Access the PROTECTED fields and methods from child class located in a different package
public class Q3a {
	protected int number=10;
	protected String string = new String("Jala Academy");
	protected double doublemethod() {
		return 20.00;
	}
	protected String stringmethod(String a,String b) {
		return a+b;
	}

}
