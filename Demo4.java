class demo
{
	public static void main(String args[])
	{
		int n=20;
		for(int i=0;i<n;i++)
		{
			System.out.print("      ");
			for(int j=0;j<n;j++)
			{
				if(i-j>=(n-1)/2||i+j>=(n-1)+(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
     				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
					
