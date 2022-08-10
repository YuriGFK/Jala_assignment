package AbstractClass;
//Create an instance for the child class in child class and call abstract methods
public class Q3childclass extends Q3{

	public static void main(String[] args) {
		Q3childclass obj = new Q3childclass();
		System.out.println(obj.abstractmethod());
		// this will show error because superclass is an abstract class(b/c we have to call an abstract method from base class)

	}

}
