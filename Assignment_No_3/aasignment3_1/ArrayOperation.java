package oopj.aasignment3_1;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperation {
   private static int [] arr;
   private static int sum;
   private static double avg;
   private static int min;
   private static int max;
   
   public ArrayOperation() {
	   
   }
   
   private  static  Scanner sc = new Scanner(System.in);
   
   public static void acceptElements(int size) {
	   ArrayOperation.arr=new int[size];
	   
	   for(int i=0; i<arr.length; i++) {
		   ArrayOperation.arr[i]=sc.nextInt();
	   }
	   ArrayOperation.max=ArrayOperation.min=ArrayOperation.arr[0];
	   }
   public static void displayArray() {
	     for(int elements : ArrayOperation.arr) {
	    	 System.out.print(elements +" ");
	     }
	     System.out.println();
   }
   public static int sumOfArray() {
         for(int elements : ArrayOperation.arr) {
        	 ArrayOperation.sum+=elements;
         }
            return  ArrayOperation.sum;
   }
   public static double avgOfArray() {
	   			
    ArrayOperation.avg+=ArrayOperation.sum/ArrayOperation.arr.length;
         return  ArrayOperation.avg;
 }
   public static int minOfArray() {
         for(int elements : ArrayOperation.arr) {
            if(ArrayOperation.min>elements)
            	ArrayOperation.min=elements;
         }
         return ArrayOperation.min;
   }
   
   public static void sortArray() {
	   Arrays.sort(ArrayOperation.arr);
	   ArrayOperation.displayArray();
   
   }
}
