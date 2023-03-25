class Pattern11
{
	public static void main (String args[])
	{
		for(int i=0; i<5;i++)
		{
			for (int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
     *
    ***
   *****
  *******
 *********
 
*/