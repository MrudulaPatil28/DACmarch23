class MatrixMulti
{
	public static void main(String args[])
	{
		
		int arr1[][]={{1,2,3},{2,3,4},{6,3,1}};
		int arr2[][]={{2,3,4},{1,2,8},{6,5,1}};
		int arr3[][]=new int [3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr3[i][j]=0;
				
				for(int k=0;k<3;k++)
				{
					arr3[i][j] += arr1[i][k] * arr2[k][j];
					
				}
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
/*
22 22 23
31 32 36
21 29 49
*/