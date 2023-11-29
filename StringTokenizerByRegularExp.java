package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokenizerByRegularExp {
   
	

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\s");
		 Matcher m= p.matcher("Pankaj sir Academy");
		 
		 while(m.find()) {
			 
		 }
	}
	
}
