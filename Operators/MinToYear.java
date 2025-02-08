import java.util.Scanner;
class  MinToYear
{
	public static void main(String[] args) 
	{
		System.out.println("Enter minutes: ");
		double min = new Scanner(System.in).nextDouble();
		double minsInYear= 24*60*365;
		long years= (long)(min/minsInYear);
		int days= (int) (min /60 /24)%365;
		System.out.println((int)min +"minutes is approximately "+years +" in years and "+days +" days");
	}
}
