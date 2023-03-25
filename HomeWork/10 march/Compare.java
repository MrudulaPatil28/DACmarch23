//Q.3 Take input as num1 & num2 and use ternary operator to compare. 
//If num1 is > then do num1 + num2.
//If num2 is < then do num1 - num2.


import java.util.Scanner;
class Compare
{
	static public void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2 ");
		int num2 = sc.nextInt();
		
		String s = (num1>num2)? "num1 is greater, Sum =" : "num2 is greater, Diff =" ;
		System.out.println(s);
		
		int t = (num1>num2)? (num1 + num2) : (num1 - num2);
		System.out.println(t);	
	}
	
}