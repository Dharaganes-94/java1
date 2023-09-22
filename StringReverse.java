package Task9;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
       String sb = sc.nextLine();
        for(int i=sb.length()-1;i>=0;--i) {        	
        	System.out.print(sb.charAt(i));
        }

	}

}
