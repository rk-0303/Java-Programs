import java.util.Scanner;
class  EvenOdd
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number to check whether it is even or odd: ");
		int num = new Scanner(System.in). nextInt();
		System.out.println((num/2)==(num/2.0));
		System.out.println("Enter a number to check whether it is even or odd: ");
		int num2 = new Scanner(System.in). nextInt();
		System.out.println((num2/2)*2==num2);
	}
}
