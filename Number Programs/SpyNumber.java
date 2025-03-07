import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int sum=0, pdt=1;

		for (int i=num;i>0 ;i/=10 ) 
		{
			int rem=i%10;
			sum+=rem;
			pdt*=rem;	
		}	

		if (pdt==sum)
			System.out.println(num+" is a Spy Number");
		else 
			System.out.println(num+" is not a spy number");
	}
}