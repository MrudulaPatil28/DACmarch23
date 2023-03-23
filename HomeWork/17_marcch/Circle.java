//Write a program to find area of Circle

import java.util.Scanner;
class Circle
{
	double pi= 3.142;
	double radius;
	
	void Area()
	{
		double area;
		area=pi*radius*radius;
		System.out.println("Area of Circle = "+area);
	}
	
	
	public static void main(String args[])
	{
		Circle c1 = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of Circle : ");
		c1.radius = sc.nextDouble();
		c1.Area();
		
		
		
	}
}