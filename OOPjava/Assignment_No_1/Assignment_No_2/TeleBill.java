import java.util.*;
class TelephoneBill{
  String customerName;
  String phoneNumber;
  int numberCallsMade;
  int durationOfCalls;

  public void setCustomerName(String customerName){
    this.customerName = customerName ;
  }

  public String getCustomerName(){
    return customerName;
  }

  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  } 

  public String getPhonenumber(){
    return phoneNumber;
  }

  public void setNumberCallsMade(int numberCallsMade){
    this.numberCallsMade = numberCallsMade;
  }

  public int getNumberCallsMade(){
    return numberCallsMade;
  }

  public void setDurationOfCalls(int durationOfCalls){
    this.durationOfCalls = durationOfCalls;
  }

  public int getDurationOfCalls(){
    return durationOfCalls;
  }

  public double callCharge(){
    if(this.numberCallsMade <= 100){
        return (numberCallsMade * 50);
    }
    else 
        return (numberCallsMade * 25);
  }

  public void callDuration(){
    if(durationOfCalls < 1)
       durationOfCalls = 1;
  }

  public void check(double charge ){
    if(charge > 1000){
        System.out.println("You crossed your monthly limit $10 :-> $"+ charge/100 );
    }
    else{
        System.out.println("Your Telephone Bill :-> $"+ charge/100);
    }
 }
}
public class TeleBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       TelephoneBill tBill = new TelephoneBill();
       
       System.out.println("Enter Customer Name : ");
       tBill.setCustomerName(sc.nextLine());
       tBill.getCustomerName();
       System.out.println("Phone Number : ");
       tBill.setPhoneNumber(sc.nextLine());
       tBill.getPhonenumber();
       System.out.println("Number Of Calls Made : ");
       tBill.setNumberCallsMade(sc.nextInt());
       tBill.getNumberCallsMade();
       System.out.println("Duration Of Calls : ");
       tBill.setDurationOfCalls(sc.nextInt());
       tBill.getDurationOfCalls();

       double charge = tBill.callCharge();
       tBill.callDuration();
       tBill.check(charge);
    }
}