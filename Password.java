package RegularExpression;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter your detail ");
        String str= sc.next();
	try {
      String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
      if(str.matches(regex)) {
    	  System.out.println("valid password");
      }
      else {
		System.out.println("not valid");
	}
     
	 }catch(Exception e) {
		e.printStackTrace();
	}
}
}
