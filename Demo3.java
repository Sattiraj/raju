class demo
{
	public static void main(String args[])
	{
		int n=26;
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.print("      ");
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==0&&i<n-1||j==n-1&&i<n-1||i+j<=(n-1)/2||j-i>=(n-1)/2)
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