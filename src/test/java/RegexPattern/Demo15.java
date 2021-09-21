package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo15 {

	public static void main(String[] args) {

		String sentence ="tamil tamilan talibans 123456 !@#$%^&";
		/*\\w all words and numbers display.. special char not display*/
		Pattern p=Pattern.compile("\\w");
		Matcher m=p.matcher(sentence);
		while(m.find()) {
			System.out.println("starts at "+m.start()+" "+m.group()+" Ends at " +m.end());
		}

	}

}
