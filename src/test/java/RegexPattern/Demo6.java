package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo6 {

	public static void main(String[] args) {
		String s ="abcabcabcabcabc";
		/*char classes find --> find expect either b and c*/
		Pattern p=Pattern.compile("[^bc]");
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
