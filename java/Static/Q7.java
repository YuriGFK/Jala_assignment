package Static;
//Call static methods and instance methods in main method
public class Q7 {

	public static void main(String[] args) {
		Q07 hello = new Q07();//Q01 is class and hello is instance of that class
		String Something=Q07.DoSomething("Hello Jala academy ");//static member allows to call by its class name
		String Somethingelse=hello.DoSomethingelse("Greetings Seniors");//non static only allows to be called by its instance
		System.out.println(Something);
		System.out.println(Somethingelse);

	}

}
