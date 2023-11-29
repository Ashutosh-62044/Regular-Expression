package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression {
      public static void main(String[] args) {
    	  Pattern p = Pattern.compile("[a-z]");
		//Pattern p = Pattern.compile("[0-9]");
		Matcher m = p. matcher("asvhb1235&h#098");
		while(m.find()) {
			System.out.println(m.start()+"..."+m.group());
		}
	}
}
