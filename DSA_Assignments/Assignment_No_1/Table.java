// Recursive Program to print multiplication table of a number
import java.util.Scanner;
class Table {
     
    static void mul_table(int N, int i)
    {
        // Base Case
        if (i > 10)
            return ;
			
        System.out.println(N + " * " + i + " = " + N * i);
                
        mul_table(N, i + 1);        // Recursive call to next iteration
    }
     
    public static void main (String[] args)
    {
        //int N = 8;
        //int N = 5;
		int N;
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter number : ");
    		N=sc.nextInt();
			
        mul_table(N, 1);    // Function call to print the table
       
    }
}