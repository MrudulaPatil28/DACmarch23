//Find Largest & smallest element of array

import java.util.Scanner;

class ArrayMaxMin
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
			
		}System.out.println();
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Largest element present in array : "+max);
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Smallest element present in array : "+min);
	}
}