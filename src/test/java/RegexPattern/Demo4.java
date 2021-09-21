package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {

	public static void main(String[] args) {
		String s ="Hi Hello How are you?";
		/*char find */
		Pattern p=Pattern.compile("How");
		Matcher m=p.matcher(s);
		while(m.find()) {
			System.out.println(+m.start()+" "+m.group()+" "+m.end());
		}


	}

}
