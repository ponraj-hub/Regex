package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo12 {

	public static void main(String[] args) {
		
		String sentence ="tamil tamilan talibans";
		/*\\S expect space display only letters(Non-space)*/
		Pattern p=Pattern.compile("\\S");
		Matcher m=p.matcher(sentence);
		while(m.find()) {
			System.out.println("starts at "+m.start()+" "+m.group()+" Ends at " +m.end());
		}

	}

}
