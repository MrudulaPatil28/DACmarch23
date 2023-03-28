class MatrixTrans
{
	public static void main(String args[])
	{
		int arr_ori[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr_trans[][]= new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr_trans[i][j]=arr_ori[j][i];
			}
		}
		System.out.println("Original Matrix");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr_ori[i][j] + " ");
			}System.out.println("");
		}
		
		
		System.out.println("Transpose Matrix");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr_trans[i][j] + " ");
			}System.out.println("");
		}
		
	}
}
/*
Original Matrix
1 2 3
4 5 6
7 8 9
Transpose Matrix
1 4 7
2 5 8
3 6 9
*/