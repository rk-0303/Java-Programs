import java.util.Scanner;
class PrimeNumbersInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the starting range: ");
		int start=sc.nextInt();
		System.out.println("Enter the ending range: ");
		int end= sc.nextInt();

		int j;

		for (int i=start;i<end ;i++ )
		{
			for (j=2;j<=i ;j++ )
			{
				if (i%j==0)
				{
					break;
				}
			}
			if (i==j)
			{
				System.out.print(" "+j);
			}
		}
	}
}
