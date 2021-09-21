package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {

	public static void main(String[] args) {
		String s="dcaln dcaln vsdvew vshdg hdg";
		/* either or used by | symbol */
		Pattern p=Pattern.compile("hdg$");
		Matcher m=p.matcher(s);
		while(m.find()){
			System.out.println(m.group()+" starts at "+m.start()+" ends at "+m.end());
		}

	}

}
