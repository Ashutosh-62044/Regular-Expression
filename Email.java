package RegularExpression;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter your detail ");
        String str= sc.next();
	try {
      String regex= "^[A-Za-z0-9+_.-]+@(.+)$";
      if(str.matches(regex)) {
    	  System.out.println("valid Email id");
      }
      else {
		System.out.println("not valid");
	}
     
	 }catch(Exception e) {
		e.printStackTrace();
	}
}
}
