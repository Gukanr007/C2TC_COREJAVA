package overloading;
import java.util.*;
public class Executor {

	public static void main(String[] args) {
		String str;
		int val;
		Scanner sc = new Scanner(System.in);
	   
	    System.out.println("The String:");
	    str = sc.nextLine();
	    System.out.println("The Value:");
	    val = sc.nextInt();
	    System.out.println("the value:");
	    System.out.println("The given String:"+Operation.isPalindrome(str));
	    System.out.println("The given Value :"+Operation.isPalindrome(val));
	}

}

