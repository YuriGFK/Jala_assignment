package AccessModifiers;
////Create a class with PRIVATE fields, private method and a main method. Print the fields in main method. Call the private method in main method. Create a sub class and try to access the private fields and methods from sub class
public class Q1subclass extends Q1{
	Q1 obj1 = new Q1subclass();
	


     public static void main(String[] args) {
	    System.out.println(obj1.name);
	    System.out.println(obj1.age);
	    obj1.method();
    }
}