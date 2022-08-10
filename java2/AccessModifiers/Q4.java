package AccessModifiers;
//Create a class with PUBLIC fields and methods. Access the public methods and fields from any class in the same package or different package
public class Q4 {

	public static void main(String[] args) {
		Q4a obj = new Q4a();
		System.out.println(obj.number);
		System.out.println(obj.string);
		System.out.println(obj.summethod(54, 15));
		System.out.println(obj.concamethod("Jala ", "Internship"));

	}

}
