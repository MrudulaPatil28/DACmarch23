class Pattern5
{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--)
	{
		for(int k=1;k<=i;k++)
		{
			System.out.print("  ");
		}
		for(int j=i;j<=9;j++)
		{
			System.out.print(j+" ");
		}
		for(int r=8;r>=i;r--)
		{
			System.out.print(r+" ");
		}
		
		System.out.println("");
		
	}
	}
	
}
/*
                  9
                8 9 8
              7 8 9 8 7
            6 7 8 9 8 7 6
          5 6 7 8 9 8 7 6 5
        4 5 6 7 8 9 8 7 6 5 4
      3 4 5 6 7 8 9 8 7 6 5 4 3
    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/