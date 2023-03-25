/*Q.5 Write a java program to identify grade of student.
		Input: Total marks, marks obtained.
		Grade: >95% : Distinction
			 >= 85% : First class
			 >= 75% : Second class
			  <75 % ; Average 
*/

import java.util.Scanner;
class Grade
{
	
	static public void main (String args[])
	{
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter total marks");
	int x = sc.nextInt();
	System.out.println("Enter marks obtained");
	int y = sc.nextInt();
	
	float percentage = y*100/x;
	System.out.println("Percentage = "+ percentage);
	
	if (percentage>95)
		System.out.println("Grade : Distinction");
	else if (percentage>=85 && percentage<95)
		System.out.println("Grade : First Class");
	else if (percentage>=75 && percentage<85)
		System.out.println("Grade : Second Class");
	else
		System.out.println("Grade : Average");
	
	}
}