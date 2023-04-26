package oopj.assignment3_7;

import java.util.* ;
import java.util.Arrays;


class ArrayX
{
    public int arr1[][] ;
    public int arr2[][] ; 
    public int iRow ;
    public int iCol ;

    public ArrayX(int Row , int Col)
    {     
        this.iRow = Row ;
        this.iCol = Col ;

        this.arr1  = new int [iRow][iCol] ;
        this.arr2  = new int [iRow][iCol] ;           
    }
}

class MatrixTest
{
    private static Scanner sc = new Scanner(System.in);
    public  static  void acceptRecord(int arr[][],int iRow , int iCol)
    {
        
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				arr[i][j]= sc.nextInt();
			}
		}
    }
		
    public  static  void printRecord(int arr[][])
    {
        System.out.println( Arrays.deepToString(arr));     
    }

    public  static  void Addition(int arr1[][], int arr2[][],int iRow , int iCol)
    {
        System.out.println("----------------------------------------------------------");
        System.out.println("Addition of two matrices");
        int ans [][] = new int [iRow][iCol] ;
       
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                ans[i][j] = arr1[i][j] + arr2[i][j] ;
            }     
        } 
        MatrixTest.printRecord(ans);
    }

    public  static  void Subtraction(int arr1[][], int arr2[][],int iRow , int iCol)
    {
        System.out.println("----------------------------------------------------------");
        System.out.println("Subtraction of two matrices");
        int ans [][] = new int [iRow][iCol] ;
       
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                ans[i][j] = arr1[i][j] - arr2[i][j] ;
            }     
        } 
        MatrixTest.printRecord(ans);
    }
    
    public  static  void Multiplication(int arr1[][], int arr2[][],int iRow , int iCol)
    {
        System.out.println("----------------------------------------------------------");
        System.out.println("Multiplication of two matrices");
        int ans [][] = new int [iRow][iCol] ;
       
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                ans[i][j] = arr1[i][j] * arr2[i][j] ;
            }     
        } 
        MatrixTest.printRecord(ans);
    }
    
    public  static  void Transpose(int arr[][],int iRow , int iCol)
    {
        int ans [][] = new int [iRow][iCol] ;
       
        for(int i=0;i<iCol;i++)
        {
            for(int j=0;j<iRow;j++)
            {
                ans[i][j] = arr[j][i] ;
            }     
        } 
        MatrixTest.printRecord(ans);
    }

    public static int menuList( )
    {
        System.out.println();
        System.out.println("--------------SELECT OPERATION------------------------");
        System.out.println("0.Exit");
        System.out.println("1.Accept Record.");
        System.out.println("2.Print Record");
        System.out.println("3.Addition of two matrices");
        System.out.println("4.Subtraction of two matrices");
        System.out.println("5.Multiplication of two matrices");
        System.out.println("6.Transpose of Matrix");
        System.out.println("-------------------------------------------------------");
        System.out.print("Enter choice  : ");
        return sc.nextInt();
    }
 
}

public class Matrix
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------");
        System.out.println("Enter No of Rows of 2D Array");
        int iRow = sc.nextInt();
        System.out.println("Enter No of Columns of 2D Array");
        int iCol = sc.nextInt();
    
        ArrayX obj = new ArrayX(iRow,iCol);

        int choice;

        while( ( choice = MatrixTest.menuList( ) ) != 0 )
        {
            switch( choice )
            {
                case 1:
                System.out.println();
                System.out.println("Enter the Elements  of 1st Matrix");
                MatrixTest.acceptRecord(obj.arr1 ,iRow ,iCol);
                System.out.println("Enter the Elements  of 2nd Matrix");
                MatrixTest.acceptRecord(obj.arr2 ,iRow ,iCol); 
                break;

                case 2:
                System.out.println();
                System.out.println("Elements of 1st Matrix");
                MatrixTest.printRecord(obj.arr1);
                System.out.println("----------------------------------------------------------");
                System.out.println("Elements of 2nd Matrix");
                MatrixTest.printRecord(obj.arr2);  
                break;

                case 3:  
                System.out.println();
                MatrixTest.Addition(obj.arr1, obj.arr2,iRow,iCol);   
                break;

                case 4:
                System.out.println();
                MatrixTest.Subtraction(obj.arr1, obj.arr2,iRow,iCol);  
                break;

                case 5:
                System.out.println();
                MatrixTest.Multiplication(obj.arr1, obj.arr2,iRow,iCol);   
                break;

                case 6:
                System.out.println(); 
                System.out.println("Transpose of 1st Matrix");
                MatrixTest.Transpose(obj.arr1 ,iRow ,iCol);
                System.out.println("----------------------------------------------------------"); 
                System.out.println("Transpose of 2nd Matrix");
                MatrixTest.Transpose(obj.arr1 ,iRow ,iCol); 
                break;
            }
        }
 
    }
}
