class Pattern9
{
	public static void main(String args[])
	{
		for (int i=65;i<=69;i++)			
		{	for(int k=68; k>=i; k--)
			{
				System.out.print(" ");
			}
			for (int j =65;j<=i;j++) 	
			{
				System.out.print((char)j + " ");
			}
			System.out.println();
		}
	}
}

/* 
    A
   A B
  A B C
 A B C D
A B C D E

*/