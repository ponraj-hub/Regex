package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo10 {

	public static void main(String[] args) {
		String s ="!@##$%abcabcabcabcabcABC32104569877?";
		/*display only special character*/
		Pattern p=Pattern.compile("[^a-zA-Z0-9]");//[A-Z][a-z] for capital and small
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}

	}

}
