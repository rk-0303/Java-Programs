import java.util.Scanner;
class KrishNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		int dup=num;
		int sum=0;

		while (num>0)
		{
		int rem =num%10;
			int fact =1;
			if (!(rem%2==0))
			{
				for (int i=rem; i>=1 ;i-- )
				{
					fact*=i;
				}
					sum+=fact;
					num/=10;
			}
			System.out.println((dup==sum?dup +" is krish ":dup+" is not krish"));
			continue;
		}
			
}

}