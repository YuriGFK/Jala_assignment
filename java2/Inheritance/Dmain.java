package Inheritance;
//A, B and C are classes. A is a super class. B is a sub class of A. C is a sub class of B. Create three methods in each class, 2 methods are specific to each class and third method (override method) should be in all three Classes A, B and C. Create a class with main method. Create an object for each class A, B and C in main method and call every method of each class using its own object/instance. Call an overridden method with super class reference to B and C class’s objects. Runtime Polymorphism with Data Members/Instance variables, Repeat the above process only for data members
public class Dmain {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		System.out.println(obj1.method5());
		System.out.println(obj1.method6());
		System.out.println(obj2.method3());
		System.out.println(obj2.method4());
		System.out.println(obj3.method1());
		System.out.println(obj3.method2());
		System.out.println(obj1.method());
		System.out.println(obj2.method());
		System.out.println(obj3.method());

	}

}
