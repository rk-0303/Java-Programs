import java.util.Scanner;
class BouncyIncreasing
{
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a number: " );
	int num=sc.nextInt();
	int min=Integer.MAX_VALUE;
	int dup=num;
	boolean flag=true;

	while(num>0)
	{
		int rem=num%10;
		if(rem<min)
			min=rem;
		else
			flag=false;

		num/=10;
	}
	if (flag)
		System.out.println(dup+" is an increasing number");
	else 
		System.out.println(dup+" is not an increasing number");
}
}