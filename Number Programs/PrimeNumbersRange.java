import java.util.Scanner;
class PrimeNumbersRange 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range: ");
		int range= sc.nextInt();
		int cnt=0;
		int j;

		for (int i=2;i<range ;i++ )
		{
			for (j=2;j<=i ;j++ )
			{
				if (i%j==0)
					break;
			}
			if (i==j)
			{
				cnt++;
				System.out.print(j+" ");
			}
		}
		System.out.println();
		System.out.println(cnt);
	}
}
