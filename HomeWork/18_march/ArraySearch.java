//Search given element of array

import java.util.Scanner;

class ArraySearch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the array elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Array elemrnts are : ");
		for(int i=0;i<size;i++)
		{	
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("Enter the element to be searched :");
		int search = sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]==search)
			{
				System.out.println(search+" is found at position "+(i+1));
				
			}
		
		}
	}
}