//Q.4 Write java program to identify eligibility criteria of a voter.

// Write java program to identify eligibility criteria of a voter.
import java.util.Scanner;
class Vote
{
	static public void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		
		if (age>=18){
			
			System.out.println("Enter Citizenship---> 1.India 2.Other");
			int c = sc.nextInt();
			if(c==1)
				System.out.println("You can vote...!!!");
			else 
				System.out.println("You cannot vote...!!!");
			
		}
		
		else 
		System.out.println("You cannot vote...!!!");
	}
}

