package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo11 {

	public static void main(String[] args) {
		String sentence ="tamil tamilan talibans";
		/*\\s displays only space(Only space)*/
		Pattern p=Pattern.compile("\\s");
		Matcher m=p.matcher(sentence);
		while(m.find()) {
			System.out.println("starts at "+m.start()+" "+m.group()+" Ends at " +m.end());
		}


	}

}
