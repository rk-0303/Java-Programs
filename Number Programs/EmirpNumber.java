import java.util.Scanner;
class  EmirpNumber
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int dup =num;
		int cnt =0;
		int rev=0;

		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				cnt++;
				break;
			}

		}

		if (cnt>0)
		{
			System.out.println("Number is not EMIRP as it is not prime");
		}
		else
		{
			cnt=0;
			while (num>0)
			{
				int rem=num%10;
				rev*=10+rem;
				num/=10;
			}
			for (int i=2;i<rev ;i++ )
			{
				if (rev%i==0)
				{
					cnt++;
					break;
				}
			}

			if (cnt==00)
			{
				System.out.println(dup+" is a EMIRP number");
			}
		}
	}
}
