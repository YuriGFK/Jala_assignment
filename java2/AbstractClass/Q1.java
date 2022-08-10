package AbstractClass;
// Create an abstract class with abstract and non-abstract methods.

abstract public class Q1 {
	abstract int abstractmethod();
	int concretemethod() {
		return 50;
	}

	public static void main(String[] args) {
		Q1 obj = new Q1();//not possible because class is an abstract class
		System.out.println(obj.concretemethod());
		System.out.println(obj.abstractmethod());

	}

}
