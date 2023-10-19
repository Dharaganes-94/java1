package Task9;

import java.util.Scanner;

public class HotelTariff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    int month = sc.nextInt();
	    double rent = sc.nextDouble();
	    int days = sc.nextInt();
	    
	    if (month < 1 || month > 12) {
	    	
	      System.out.println("Invalid input");
	      
	      return;
	    }
	    boolean peak = (month >= 4 && month <= 6) || (month >= 11 && month <= 12);
	    
	    double tariff = rent * days;
	    
	    if (peak)
	    {
	      tariff *= 1.2;
	    }
	    System.out.printf("Hotel Tariff: Rs.%.2f\n", tariff);
	  }
	}


