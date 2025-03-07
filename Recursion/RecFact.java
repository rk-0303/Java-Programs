import java.util.Scanner;
class RecFact 
{
	public static int Fact(int num)
	{
		if (num==0)
		{
			return 1;
		}
		return num*Fact(num-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(Fact(num));
	}
}
