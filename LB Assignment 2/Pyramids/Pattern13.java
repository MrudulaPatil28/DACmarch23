class Pattern13
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");	
			}
			for(int j=1;j<=i;j++)
			{
				if(i==6||j==1||i==j)
				{
					System.out.print("* ");
				}
				else
				System.out.print("  ");	
			}
			System.out.println();
		}
	}
}
/*
     *
    * *
   *   *
  *     *
 *       *
* * * * * *
*/