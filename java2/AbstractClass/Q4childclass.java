package AbstractClass;
////Create an instance for the child class in child class and call non-abstract methods
public class Q4childclass extends Q4{

	public static void main(String[] args) {
		Q4childclass obj = new Q4childclass();
		System.out.println(obj.concretemethod());
		System.out.println(obj.nonabstractmethod());

	}

}
