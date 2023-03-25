// Q.2 Make use of ternary operator and identify the even number


import java.util.Scanner;

class EvenNumber
{
	static public void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		
		String y = (x%2==0)? " even": "odd";
		System.out.println("the number is "+ y);
		
	}
}