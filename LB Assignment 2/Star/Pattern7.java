class Pattern7
{
	public static void main(String args[])
	{
		for(int a=0;a<5;a++)
		{
			for(int b=4;b>a;b--)
			{
				System.out.print(" ");
			}
			for(int c=0;c<2*a+1;c++)
			{
				System.out.print("*");
			}System.out.println();
		}
		
		for(int i=0;i<4;i++)
		{
			for(int k=0;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*(4-i)-1;j++)
			{
				System.out.print("*");
			}System.out.println();
				
		}
		
	}
}

/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/