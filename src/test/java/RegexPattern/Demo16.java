package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo16 {

	public static void main(String[] args) {

		String sentence ="tamil tamilan talibans 123456 !@#$%^&";
		/*\\W only special char only display..alphanumeric not display space also consider*/
		Pattern p=Pattern.compile("\\W");
		Matcher m=p.matcher(sentence);
		while(m.find()) {
			System.out.println("starts at "+m.start()+" "+m.group()+" Ends at " +m.end());
		}
	}

}
