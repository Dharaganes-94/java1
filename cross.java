package Task9;

public class cross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows = 5;

	    for (int i = 0; i < rows; i++) {
	      for (int j = 0; j < rows; j++) {
	        if (i==j || i+j==rows-1) {
	          System.out.print("*");
	        } else {
	          System.out.print(" ");
	        }
	      }
	      System.out.println();
	    }
	  }
	}

