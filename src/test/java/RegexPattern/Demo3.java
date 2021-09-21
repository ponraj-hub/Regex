package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {

	public static void main(String[] args) {
		String s ="Hi Hello How are you?";
		/*Either or used by | symbol */
		Pattern p=Pattern.compile("H|t");
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(+m.start()+" "+m.group()+" "+m.end());
		}

	}

}
