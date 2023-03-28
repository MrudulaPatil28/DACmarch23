// Write program to add two matrix

class MatrixAdd
{
	public static void main(String args[])
	{
		int arr1[][]={{1,2,3},{4,5,6},{1,2,4}};
		int arr2[][]={{5,5,3},{3,4,2},{7,5,5}};
		int arr3[][]=new int [3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr3[i][j]=arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j] + " ");
				
			}System.out.println();
		}
	}
		
}
/*
6 7 6
7 9 8
8 7 9
*/