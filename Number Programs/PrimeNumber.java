import java.util.Scanner;
class  PrimeNumber
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println((num==2||num==3||num==5)?(num+ " is prime"):((num%2==0||num%3==0||num%5==0)?(num+ " is not prime"):(num+ " is prime")));
	}
}
