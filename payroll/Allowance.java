package project.payroll;
import java.util.HashMap;
import java.util.Scanner;


public class Allowance {
	
	  public int calculate(Scanner in) {
		  System.out.println("Do you come by your own vehicle?(Yes/No):");
	        String ans = in.nextLine();
	        if (!ans.equals("yes") && !ans.equals("no")) {
	            System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
	            return calculate(in); 
	        }
              int travel =0 ;
	        if(ans.equalsIgnoreCase("yes")) {
	        	  
	            	System.out.println("Enter the km you travel(limit:300):");
	            	int km  = in.nextInt();
	            	if(km ==0) {
	            		
	            	}else if(km > 0 && km<= 300) {
	            		travel = km*50;//per km 50
	            		System.out.println("Your fuel Payment is "+travel);
	            	}
	            	
	            	else{
	            		System.out.println("We can't afford to pay you, so you might consider working from home instead.");
	            	}
	               return travel; 
	            }
			return travel;
	        } 

	  public int OverTime(Scanner in) {
  	    int time = 0;
      	System.out.println("Enter your over time hours(if you didnt did any OverTime enter '0' & max hour '16'):");
      	int Hour = in.nextInt();
      	if(Hour==0) {
      		System.out.println("No OverTime :(");
      	}else if(Hour > 0 && Hour<= 16) {
      		 time = Hour*1000; //per hour
      		System.out.println("Your OverTime Payment is "+time);
      	}else{
      		System.out.println("Overtime hours exceed company policy. Maximum allowed is 16 hour , ");
      		System.out.println("Wasting time on travel bruh???, may be you might consider working from home instead.");
      	}
         return time; 
      }
	 
}
