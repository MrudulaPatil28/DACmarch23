package oopj.assignment3_4;

public class Program {
	public static void main(String[] args) {
		
		int choice=0;
		while( ( choice = (ReservationSystem.menu())) != 0) 
		{   
			 switch( choice ) {
			 
			 case 1:
				 ReservationSystem.displaySeats();
				 break;
				 
			 case 2:
				    ReservationSystem.reserveSeat();
				 break;
				 
			 case 3:
		            ReservationSystem.revenue();
				 break;
				 
			 case 4:
				    ReservationSystem.availableSeats();
				 break;
				 
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			 
			 }System.out.println("Thank you for using BookMyTickets.com");
         }
    }
}
