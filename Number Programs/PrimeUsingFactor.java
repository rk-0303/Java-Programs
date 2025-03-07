import java.util.Scanner;
class PrimeUsingFactor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int cnt=0;


		for (int i=2;i<num ;i++ )
		
			if (num%i==0)
			  cnt++;
			System.out.println(cnt==0?num+ " is a prime number": num+" is not prime.");
			
	}
}
