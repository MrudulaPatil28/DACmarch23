import java.util.Scanner;
class Sum_Of_Natural_No{

 public static void main(String args[])
	{
    		int num;
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter how many terms you want to add");
    		num=sc.nextInt();

    		System.out.println("Summation of first "+num+" natural numbers = "+sum(num));
	}

	static int sum(int n)
	{
    		if(n==0)
        		return n;
    		else 
        		return (n+sum(n-1));           
	}
}