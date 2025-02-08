import java.util.Scanner;
class Converison 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Temperature in Celsius deg: ");
		Scanner sc = new Scanner(System.in);
		double cel= sc.nextFloat();
		double far = (9.0/5) * cel +32;
		System.out.print("Conversion of entered Celsius deg to Fahrenheit is: "+far +" deg^f");
	}
}
