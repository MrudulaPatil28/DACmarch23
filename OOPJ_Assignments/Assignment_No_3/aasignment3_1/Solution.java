package oopj.aasignment3_1;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int [] arr = new int [sc.nextInt()];
		int sum =0;
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the array element at "+i);
			arr [i]= sc.nextInt();
			sum += arr[i];	
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("The sum of all the elements in the array is 	: "+sum);
		System.out.println("The average of all the elements in the array is : "+sum/arr.length);
		Arrays.sort(arr);
		System.out.println("The largest element in the array is 		: "+arr[arr.length-1]);
		System.out.println("The smallest element in the array is		: "+arr[0]);
		System.out.println("The sorted array in ascending order 		: "+Arrays.toString(arr));
		

	}

}


/*QUESTION
1. Design a Java program that will accept an array of integers and perform various
   operations on it. The program should have the following features:
		a. Accept an array of integers of size n from the user.
		b. Display the contents of the array on the console.
		c. Calculate and display the sum of all the elements in the array.
		d. Calculate and display the average of all the elements in the array.
		e. Find and display the largest element in the array.
		f. Find and display the smallest element in the array.
		g. Sort the array in ascending order and display the sorted array on the console.
	You should use static methods to implement the above features.
	Example Input:
	Array: {5, 10, 15, 20, 25}
	Example Output:
	Contents of Array: 5 10 15 20 25
	Sum of Array: 75
	Average of Array: 15
	Largest element in Array: 25
	Smallest element in Array: 5
	Sorted Array: 5 10 15 20 25
 */
