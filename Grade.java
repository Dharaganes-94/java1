package Task9;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int marks;
		marks = sc.nextInt();
		System.out.println("Enter the marks "+marks);
		
         if(marks>100){
			
			System.out.println("Invalid input");
			
		}
		
         else if(marks==100) {
			
			System.out.println("Grade S");
		
		    }
		else if(marks>=90) {
			
			System.out.println("Grade A");
			
			}
		else if(marks>=80) {
			
			System.out.println("Grade B");
			
		    }
		else if(marks>=70) {
			
			System.out.println("Grade C");
			
		    }
		else if(marks>=60) {
			
			System.out.println("Grade D");
			
		    }
		else if(marks>=50) {
			
			System.out.println("Grade E");
			
			}
         
		else 
			
			System.out.println("Grade F");

		   }
	}


