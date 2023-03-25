// Q.1 Consider 3 variables a,b,c and identify max and min value

import java.util.Scanner;

class Variable
{
	static public void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first variable a = ");
		int a = sc.nextInt();
		
		System.out.println("Enter second variable b = ");
		int b = sc.nextInt();
		
		System.out.println("Enter third variable c = ");
		int c = sc.nextInt();
		
		
		if(a>b && a>c)
			System.out.println(" a is greatest");
		else if (b>a && b>c)
			System.out.println("b is greatest");
		else
			System.out.println("c is greatest");
		
		String x = (a<b && a<c) ?  "a": (b<a && b<c) ? "b" : "c";
		System.out.println("Smallest variable is  "+x);		
		

	}
}