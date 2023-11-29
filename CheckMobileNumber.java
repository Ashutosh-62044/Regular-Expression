
package RegularExpression;
import java.util.Scanner;
public class CheckMobileNumber {
  public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your mobile number");
	String mobileNumber = sc.next();
	
	String regex = "[6-9][0-9]{9}";
	if(mobileNumber.matches(regex)) {
		System.out.println("valid mobile number");
	}else {
		System.out.println("invalid mobile number");
	}
  }
}
