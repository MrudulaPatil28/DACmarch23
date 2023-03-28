//Display the elements of Array

import java.util.Scanner;

class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the array elements :");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("Array elemrnts are : ");
		for(int i=0;i<size;i++)
		{	
			System.out.print(a[i]+" ");
			
		}
	}
}