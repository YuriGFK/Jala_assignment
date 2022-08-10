package Strings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Q6 {
//Matching a String Against a Regular Expression With matches()

	public static void main(String[] args) {
		// Matching a String Against a Regular Expression With matches()
		Pattern pattern = Pattern.compile("jal*");
		Matcher m = pattern.matcher("jalaacademy.jalatechnologies");
		while(m.find()) {
			System.out.println("Pattern found from "+m.start()+" to "+(m.end()-1));
		}

	}

}
