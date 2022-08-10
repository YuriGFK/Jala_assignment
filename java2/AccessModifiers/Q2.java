package AccessModifiers;

public class Q2 {
//Create a class with DEFAULT fields and methods. Access these fields and methods from any other class in the same package

	public static void main(String[] args) {
		Q2a obj = new Q2a();
		System.out.println(obj.number);
		System.out.println(obj.string);
		System.out.println(obj.numbermethod());
		System.out.println(obj.stringmethod());

	}

}
