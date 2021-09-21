package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo18 {

	public static void main(String[] args) {
	
		String sentence ="amil Tamilan Talibans";
		/*\\B (Tamil\\B-->starts with tamil and not end with tamil..Tamilan,TamilNadu)*/
		Pattern p=Pattern.compile("Taliba\\B");
		Matcher m=p.matcher(sentence);
		while(m.find()) {
			System.out.println("starts at "+m.start()+" "+m.group()+" Ends at " +m.end());
		}
		
	}

}
