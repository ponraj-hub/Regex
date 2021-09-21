package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo13 {

	public static void main(String[] args) {

		String sentence ="tamil tamilan talibans 123456";
		/*\\d display only numbers(digit)*/
		Pattern p=Pattern.compile("\\d");
		Matcher m=p.matcher(sentence);
		while(m.find()) {
			System.out.println("starts at "+m.start()+" "+m.group()+" Ends at " +m.end());
		}

	}

}
