import java.util.Scanner;

class SBI{
    private String accName;
    private int accNumber;
    private double balance;

    void set()
    {
        Scanner in=new Scanner(System.in);

        System.out.println("0.Exit");
        System.out.println("1.Create a new account");
        System.out.println("2.Deposit money ");
        System.out.println("3.Withdraw money");
        System.out.println("4.account balance");
        System.out.println("5.account holder's information");
        System.out.print("Enter your choose : ");
        int choose=in.nextInt();

        while(choose != 0)
        {
            switch(choose)
            {
                case 1:
                        System.out.print("Enter your name : ");
                        in.nextLine();
                        this.accName=in.nextLine();
                        this.accNumber=2023001;
                        this.balance=0.0;  
                        break;
                case 2:
                        System.out.print("Enter your Account number : ");
                        if(this.accNumber != in.nextInt()){
                               System.out.println("Invalid Account number!!");
                               break;
                        }
                        System.out.print("Enter deposit amount : ");
                        this.balance+=in.nextDouble();
                        break;
                case 3:
                        System.out.print("Enter your Account number : ");
                        if(this.accNumber != in.nextInt()){
                               System.out.println("Invalid Account number!!");
                               break;
                        }
                        System.out.print("Enter withdraw amount : ");
                        double w=in.nextInt();
                        if(this.balance < w ){
                               System.out.println("Insufficient Fund :");
                               break;
                        }

                        this.balance-=w;
                        System.out.println("Your current balance is : "+this.balance);
                        break;
                case 4:
                        System.out.print("Enter your Account number : ");
                        if(this.accNumber != in.nextInt()){
                               System.out.println("Invalid Account number!!");
                               break;
                        }
                        System.out.println("Your current balance is : "+this.balance);
                        break;
                case 5:
                        System.out.print("Enter your Account number : ");
                        if(this.accNumber != in.nextInt()){
                               System.out.println("Invalid Account number!!");
                               break;
                        }
                        System.out.println("Account name : "+this.accName);
                        System.out.println("Account no. : "+this.accNumber);
                        System.out.println("Balance : "+this.balance);
                        break;
            }
        }

     }
 }
 class Que6 {
    public static void main(String[] arg)
    {
        SBI s1=new SBI();
        s1.set(); 
    }
}