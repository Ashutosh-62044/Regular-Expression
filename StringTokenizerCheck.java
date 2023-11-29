package RegularExpression;
import java.util.StringTokenizer;

public class StringTokenizerCheck {
   public static void main(String[] args) {
	int count=0;
	   StringTokenizer str = new StringTokenizer("pankaj sir Academy");
        
	   while(str.hasMoreTokens()) {
		   System.out.println(str.nextToken());
		   count++;
	   }
	   System.out.println("Total number of word = " +count++);
   
   }
}