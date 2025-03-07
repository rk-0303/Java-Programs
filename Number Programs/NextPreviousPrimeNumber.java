import java.util.Scanner;
class  NextPreviousPrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		int nprime=0;
		int pprime=0;
		
		for (int i=num;i>=2 ;i-- )
		{
			boolean flag= true;
			for (int j=2;j<i ;j++ )
			{
				if (i%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag)
			{
				pprime=i;
				break;
			}
		}
		for (int i=num+1 ;;i++ )
		{
			boolean flag=true;
				for (int j=2;j<i ;j++ )
			{
				if (i%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag)
			{
				nprime=i;
				break;
			}
		}

		if (num-pprime<nprime-num)
		{
			System.out.println(pprime+" "+num);
		}
		else if (num-pprime>nprime-num)
		{
			System.out.println(nprime+" "+num);
		}
		else 
		{
			System.out.println(pprime+" "+num+" "+nprime);
		}
		
	}
}
