package Strings;

public class Q8 {
//equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
	public static void main(String[] args) {
		// equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
		String string = "JALA";
		String string1= new String("jala");
		System.out.println(string.equalsIgnoreCase(string1));//equalsIgnoreCase()
		String message = "Jala Academy";
		System.out.println(message.startsWith("Ja"));//startsWith()
		System.out.println(message.endsWith("my"));//endsWith()
		String text = "Jalatechnologies";
		String text1 = "Jalaacademy";
		System.out.println(text.compareTo(text1));//compareTo()
		

	}

}
