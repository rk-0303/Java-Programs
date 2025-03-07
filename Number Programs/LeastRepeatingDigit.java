import java.util.Scanner;
class LeastRepeatingDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		 long num= sc.nextLong();
		 int dgt=0;
		 int min=9;

		 for (int i=0;i<=9 ;i++ )
		 {
			 int cnt =0;
			 for (long j= num;j>0 ;j/=10 )
			 {
				 long rem=j%10;
				 if (i==rem)
				 {
					 cnt++;
				 }
			 }
			 if (cnt!=0)
			 {
				 if (min>cnt)
				 {
					 min=cnt;
					 dgt=i;
				 }
			 }
		 }
		 System.out.println("Min repeating digit is "+ dgt+" with fre of "+min);
	}
}
