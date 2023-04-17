import java.util.* ;

class CreditScore
{
    // creditHistory: An int to represent the length of the individual's credit history.
    public int creditHistory ;
   
    //creditUtilization: A double to represent the percentage of available credit the individual is using.
    public double creditUtilization ;

    //paymentHistory: A boolean to represent whether the individual has a good payment history or not.
    public boolean paymentHistory ;

    public CreditScore()  //Constructor
    {}

    public void  setCreditHistory(int creditHistory)
    {
        this.creditHistory = creditHistory ;
    }
    public int  getCreditHistory(int creditHistory)
    {
        return this.creditHistory ;
    }  
    public void  setCreditUtilization(double creditUtilization )
    {
        this.creditUtilization = creditUtilization ;

    }
    public double  getcreditUtilization(double creditUtilization)
    {
         return this.creditUtilization ;
    }


    public void  setPaymentHistory(boolean paymentHistory)
    {
        this.paymentHistory =  paymentHistory ;

    }
    public boolean  getPaymentHistory(boolean paymentHistory)
    {
         return this.paymentHistory ;
    }

    public  void CalculateCreditScore()
    {
        double creditScore = 0 ;

        if(this.paymentHistory == true)
        {
            creditScore = (this.creditHistory * 15) + (int)(this.creditUtilization * 30) + 55 ;
            System.out.println("--------------Credit Score : " +creditScore);
        }
        else
        {
            creditScore = (this.creditHistory * 15) + (int)(this.creditUtilization * 30) + 35 ;
            System.out.println("--------------Credit Score : " +creditScore);
        }
    }  
}

class  CreditScoreTest
{
    private static Scanner sobj = new Scanner(System.in);
    private CreditScore cobj = new CreditScore();

    private int creditHistory ; 
    private double creditUtilization ;
    private boolean paymentHistory ;

    public void acceptRecord()
    {    
        System.out.println("Enter an int value to represent the length of the individual's credit history.");
        creditHistory = sobj.nextInt();
        cobj.setCreditHistory(creditHistory);

        System.out.println("Enter Percentage of available credit the individual is using.");
        creditUtilization = sobj.nextDouble();
        cobj.setCreditUtilization(creditUtilization);
       
        System.out.println("Choose any one \n Good payment history : Enter 'true' \n Not  : Enter 'false");
        paymentHistory = sobj.nextBoolean();
        cobj.setPaymentHistory(paymentHistory);
       
    }
    public void printRecord()
    {
        System.out.println("----------Credit History : " + cobj.getCreditHistory(this.creditHistory)); 
        System.out.println("----------Credit Utilization : " + cobj.getcreditUtilization(this.creditUtilization));
        if(cobj.getPaymentHistory(this.paymentHistory) == true)
        System.out.println("----------Payment History : Good ");
        else
        System.out.println("----------Payment History : BAD ");
    }
    public void Calculate_CreditScore()
    {
        cobj.CalculateCreditScore();
    }
    
    public static int menuList( )
    {
        System.out.println("0.Exit");
        System.out.println("1.Accept Record.");
        System.out.println("2.Print Record");
        System.out.println("3.CalculateCreditScore");
        System.out.print("Enter choice  : ");
        return sobj.nextInt();
    }
}

public class Credit_Score 
{
    public static void main(String[] args) {
        int choice;
        CreditScoreTest test = new CreditScoreTest();
        while( ( choice = CreditScoreTest.menuList( ) ) != 0 ){
          switch( choice ){
            case 1:
            test.acceptRecord();
            break;
            case 2:
            test.printRecord();
            break;
            case 3:
            test.Calculate_CreditScore();
            break;
          }
        }
      }
    
}