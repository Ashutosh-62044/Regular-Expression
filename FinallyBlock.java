package RegularExpression;

public class FinallyBlock {
  public static void main(String[] args) {
	try {
		int x=10/0;
		
		System.out.println(x);
	 
	}finally {
		System.out.println("ashutosh");
		System.exit(0);
		System.out.println("ashutosh");
	}
	System.out.println("welcome");
}
}
