import java.util.Scanner;
class  NeonNumber
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		int sum=0;
		int sqr=num*num;

		while (sqr>0)
		{

			int rem= sqr%10;
			sum+=rem;
			sqr/=10;
		}
		if (sum==num) 
		{
			System.out.println(num+ " is a Neon Number");
		}
		else
			System.out.println(num+" is not neon number");

	}
}