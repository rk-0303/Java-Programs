import java.util.Scanner;
class BouncyDecreasing
{
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a number: " );
	int num=sc.nextInt();
	int max=Integer.MIN_VALUE;
	int dup=num;
	boolean flag=true;

	while(num>0)
	{
		int rem=num%10;
		if(rem>max)
			max=rem;
		else
			flag=false;

		num/=10;
	}
	if (flag)
		System.out.println(dup+" is an decreasing number");
	else 
		System.out.println(dup+" is not an decreasing number");
}
}