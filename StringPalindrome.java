package Task9;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String sb;
		sb =sc.nextLine();
		String reversesb="";
		for(int i=sb.length()-1;i>=0;--i) {
			reversesb = reversesb+sb;
		}
		if(sb.equals(reversesb)) {
			
			System.out.println("The given character is palindrome");
			
		}
		else {
			
			System.out.println("The given character is not palindrome");
		}
		

	}

}
