package oopj.assignment3_4;
import java.util.Scanner;

public class ReservationSystem {
	public static int choice;
	private static String[][] arr=new String[26][15];
	private static int rsNo= 23000;
	static Scanner sc = new Scanner(System.in);
	
	public ReservationSystem() {
		
	}
	public ReservationSystem(int a, int b){
		for(int i=0; i<20; i++) {
			for(int j=0; j<12; j++) {
			   arr [i][j] = ("A"+i+j);   
			}
		}
	}
	
    public static void displaySeats() {

 	   for(int i=0; i<20; i++) {
  	     for(int j=0; j<12; j++) {
  	    	System.out.printf("%-8s",("A"+i+j));    
  	     }
  	       System.out.println();
 	  }	
		
	}
		   
	public static void reserveSeat() {
	   System.out.println("Enter number of seats : ");
  	   int r = sc.nextInt();
	   for(int i=0; i< (r); i++) {
		
  		   System.out.println("Enter row number : ");
  		   int row = sc.nextInt();
  		   System.out.println("Enter col number : ");
  		   int col = sc.nextInt();
  		   
  		   if( arr[row][col]==("Booked"))
  			System.out.println("Invalid choice. Already sold out.");
  	        arr[row][col]=("Booked");
  	    
	   }
  	    rsNo += 1;
  	     System.out.println("Seats are booked sucessfully");
  	     System.out.println("Your Reservation No. is " + rsNo);
  	   System.out.println();
	}
	
    public static void availableSeats() {
    	int count = 0;
 	   for(int i=0; i<20; i++) {
 	       for(int j=0; j<12; j++) {
 	    	  // if(arr[i][j]==("A"+i+j)){                            //error
 	    		   System.out.printf("%-8s",("A"+i+j));         
 	    		   count++;
 	    	   //}
 	       }
 	       System.out.println();
 	   }
 	   System.out.println("Count : "+count);
	}

	public static void revenue() {
	   int count=0;
	   
 	   for(int i=0; i<20; i++) {
 	       for(int j=0; j<12; j++) {
 	    	   count +=((arr[i][j].equals("Booked"))? 1:0);         //error
 	       }
 	   }
 	   System.out.println("Count : "+count);
 	   System.out.println("Amount : "+(count*250));
		
 	
	}
	
    public static int menu() {
	
	  System.out.println("Welcome to the Book My Tickets.com");
	  System.out.println("0. Exit");
      System.out.println("1. View seating chart ");
      System.out.println("2. Reserve a seat ");
      System.out.println("3. Generate ticket sales report");
      System.out.println("4. Available seat");
      System.out.println("Enter your choice: ");
     return sc.nextInt();
	}

	
  	
}