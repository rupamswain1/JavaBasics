package pattern;

public class PrintEquilateralTriangle 
{

	public static void main(String[] args)
	{
		int input=100;
		for(int i=1;i<=input;i++)
		{
			for(int j=0;j<input-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
