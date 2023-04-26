//33) Pass integer, float and double value from command line. 
//    Parse it appropriately and perform arithmetic operations (+,-,*,/) on it.

class Test33{

public static void main(String[] args){

int a = Integer.parseInt(args[0]);
float b = Float.parseFloat(args[1]);
double sum = a+b;
System.out.println("The sum is " +sum);

int x = Integer.parseInt(args[2]);
float y = Float.parseFloat(args[3]);
float sub = x-y;
System.out.println("The sub is " +sub);

int p = Integer.parseInt(args[4]);
float q = Float.parseFloat(args[5]);
double mul = p*q;
System.out.println("The Mul is " +mul);

}
}