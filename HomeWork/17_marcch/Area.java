//Write a program to find area of circle, triangle, rectangle and square.

import java.util.Scanner;
class Area
{
	
	double radius ,base, height, pi=3.142, side,area;
	void Circle()
	{
		area = pi*radius*radius;
		System.out.println("Area of Circle = "+area);
	}
	
	void Triangle()
	{
		area = 0.5*base*height;
		System.out.println("Area of Triangle = "+area);
		
	}
	
	void Rectangle(double length, double breadth)
	{
		area = length*breadth;
		System.out.println("Area of Rectangle = "+area);
	}	
	
	void Square()
	{
		area = side*side;
		System.out.println("Area of Square = "+area);
	}
	
	public static void main(String args[])
	{
		Area cal = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of Circle");
		cal.radius = sc.nextDouble();
		cal.Circle();
		
		System.out.println("Enter base of Triangle");
		cal.base = sc.nextDouble();
		System.out.println("Enter height of Triangle");
		cal.height = sc.nextDouble();
		cal.Triangle();
		
		cal.Rectangle(23.2,15.36);
		
		cal.side =9.52;
		cal.Square();
		
	}
}