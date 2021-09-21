package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args) {
		String s="dcalne dcaln vsdvew vshdg hdg";
		/* first word find by the way of ^ */
		Pattern p=Pattern.compile("^vshdg");
		Matcher m=p.matcher(s);
		while(m.find()){
			System.out.println(+m.start()+" "+m.group()+" "+m.end());
		}
	}
	

}
