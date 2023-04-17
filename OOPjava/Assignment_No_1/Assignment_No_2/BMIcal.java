//You have been asked to write a Java program to implement a BMI(Body Mass Index)
// calculator.         //use ctor & use getter setter
import java.util.*;
class BMIcalci 
{
    public double height ;
    public double weight ;

    public BMIcal(){        //Parameterless ctor 

    } 

    }
    public void setHeight(double height)
    {
        this.height = height ;
    }
    public double getHeight(double height)
    {
        return this.height ;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getWeight(double weight)
    {
        return this.weight ;
    }
}

class BMIcal   
{
    private static Scanner sobj = new Scanner(System.in);
    private BMIcal test = new BMIcal();
    double height ;
    double weight ;
    public void acceptRecord()
    {

        System.out.println(" the height of the person in meters. : ");
        height = test.nextDouble();
        test.setHeight( height);
        System.out.println(" the weight of the person in meters. : ");
        weight = test.nextDouble();
        test.setHeight( weight);       
    }
    public void printRecord()
 { 
    System.out.println(" the height of the person in meters. : " +this.height); 
    System.out.println(" the weight of the person in meters. : "+this.weight);
 }
    public void calculateBMI()
    {
        double BMI = this.weight / (this.height * this.height); 
        System.out.println(" BMI of the person is : "+BMI);

    } 
    public static int menuList( )
    {
        System.out.println("0.Exit");
        System.out.println("1.Accept Record.");
        System.out.println("2.Print Record");
        System.out.println("3.Calculate BMI of the Person");
        System.out.print("Enter choice  : ");
        return test.nextInt();
    }     
}

public class BMICalci
{
    public static void main(String arg[])
    {
        int choice;
        BMIcalci test = new BMIcalci();

        while( ( choice = BMIcalci.menuList( ) ) != 0 )
        {
            switch( choice ){
              case 1:
                test.acceptRecord();
                break;
              case 2:
                  test.printRecord();
                  break;
              case 3:
                  test.calculateBMI(); 
                  break;   
            }
        }
    }
}








//          OR
/*
import java.util.Scanner;
public class BMIcal {
    float weight;
    float height;
    float static BMI;
    
    BMIcal() {
    }

    public void setHeight(double height)
    {
        this.height = height ;
    }
    public double getHeight(double height)
    {
        return this.height ;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getWeight(double weight)
    {
        return this.weight ;
    }
    public void calculateBMI()
    {
        double BMI = this.weight / (this.height * this.height); 
        System.out.println(" BMI of the person is : "+BMI);
        return BMI;
    }
}
class BMIcalculator{
    
    public void calculateBMI()
    {
        double BMI = this.weight / (this.height * this.height); 
        System.out.println(" BMI of the person is : "+BMI);
        return BMI;
    } 


}
   class Program{
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      BMIcalci bm= new BMIcalci();
      
      //BMIcal.BMI();
      System.out.print("Input weight in kilogram: ");
      bm.weight();
     
      System.out.print("Input height in meters: ");
      bm.height();
      
      bm.getBMI();
      System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m2");
      
   }
}
*/
