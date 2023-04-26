import java.util.Scanner;
class Calculator{
    private double height;
    private double weight;

   public double getHeight(){
    return this.height;
   }
   public void setHeight( double height){
    this.height = height;
   }
   public double getWeight(){
    return this.weight;
   }
   public void setWeight( double weight){
    this.weight = weight;
   }

   public void Printrecord(){
    double result = weight/(height * height);
    System.out.println("BMI = "+result);
   }
}
class Bmi{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Calculator in = new Calculator();
        
        System.out.println("Enter your height in meters ");
        in.setHeight(sc.nextDouble());
        
        System.out.println("Enter your weight in kilograms ");
        in.setWeight(sc.nextDouble());

        in.Printrecord();

    }
}