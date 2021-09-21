package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo5 {

	public static void main(String[] args) {
		String s ="Hi Hello Hew are you?";
		/*char classes find --> find  either H or e or w*/
		Pattern p=Pattern.compile("[Hew]");
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}

	}

}
