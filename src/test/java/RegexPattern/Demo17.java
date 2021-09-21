package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo17 {

	public static void main(String[] args) {
		
		String sentence ="amil Tamilan Talibans";
		/*\\b boundary values..(\\bTamil)where ever tamil starts*/
		Pattern p=Pattern.compile("\\bTami");
		Matcher m=p.matcher(sentence);
		while(m.find()) {
			System.out.println("starts at "+m.start()+" "+m.group()+" Ends at " +m.end());
		}
	}

}
