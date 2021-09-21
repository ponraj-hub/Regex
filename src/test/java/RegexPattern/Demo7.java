package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo7 {

	public static void main(String[] args) {
		String s ="!@##$%abcabcabcabcabcABC?";
		/*char classes find --> confirm with alphabets*/
		Pattern p=Pattern.compile("[a-zA-Z]");//[A-Z][a-z] for capital and small
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
