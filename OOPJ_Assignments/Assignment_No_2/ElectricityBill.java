import java.util.*;
class ElectricityBill{
   String customerName;
   double unitsConsumed;
   double billAmount; 

   ElectricityBill(String customerName , double unitsConsumed){
    this.customerName = customerName;
    this.unitsConsumed = unitsConsumed;
   }

   public void calculateBillAmount(){
     if(this.unitsConsumed <= 100){
        this.billAmount = unitsConsumed * 5 ;
     }
     else if(this.unitsConsumed > 100 && this.unitsConsumed <=200){
        this.billAmount = unitsConsumed * 7 ;
     }
     else
     this.billAmount = unitsConsumed * 10 ;
   }


public String getCustomername(){
    return this.customerName;
}

public double getUnitsConsumed(){
    return this.unitsConsumed;
}

public double getBillAmount(){
    return this.billAmount;
}
}


public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name : ");
        String customerName = sc.nextLine();
        System.out.println("Units Consumed : ");
        double unitsConsumed = sc.nextDouble();
        
        ElectricityBill eBill =  new ElectricityBill(customerName,unitsConsumed);

        eBill.calculateBillAmount();

        System.out.println("Customer Name : "+eBill.getCustomername());
        System.out.println("Total Units Consumed : "+eBill.getUnitsConsumed());
        System.out.println("Total Electricity Bill Amount : "+eBill.getBillAmount());
    }
}