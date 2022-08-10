package AbstractClass;
////Create a sub class for an abstract class. Create an object in the child class for the abstract class and access the non-abstract methods
public class Q2subclass extends Q2{

	public static void main(String[] args) {
		Q2 obj = new Q2();
		System.out.println(obj.concretemethod());// this will not be able to print as Q2 is abstract class but if we use polymorphism it is possible

	}

}
