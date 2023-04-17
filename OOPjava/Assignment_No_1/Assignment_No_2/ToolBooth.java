import java.util.Scanner;
class Tollbill{
    String VehicalType;
    int NumberOfAxles;
    String DistanceInformation;


    static Scanner sc = new Scanner(System.in);
    public Static vehicletype()
    {
        System.out.println("Enter the Vehicle type (Cars, vans or buses)");
        this.VehicalType = sc.nextLine();
        System.out.println("Enter the  Number of axles");
        this.NumberOfAxles = sc.nextInt();
        System.out.println("Enter the  Distance Information");
        this.DistanceInformation = sc.nextLine();
    }

    public static int menulist(){
        System.out.println("1. Enter vehicle type (car, van, bus, or truck)");
        System.out.println("2.  Enter number of axles");
        System.out.println("3. Enter distance travelled");
        System.out.println("4. Calculate toll fee");
        System.out.println("5. Generate bill");
        System.out.println("6. Exit");
        return sc.nextInt();
    }

}
class TollBooth{
    public static void main(String args[])
    {
        int choice;
        Tollbill tb = new Tollbill();
        while((choice = Tollbill.menulist())!=0){
        switch(choice){
            case 1:
                Tollbill.vehicletype();
            case 2:
                


                


        }
        }


    }