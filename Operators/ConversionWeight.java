import java.util.Scanner;
class  ConversionWeight
{
	public static void main(String[] args) 
	{
		final float pd = 0.454f;
		System.out.println("Enter the weight in Pound(s): ");
		float pound = new Scanner(System.in).nextFloat();
		float kg =  pd * pound;
		System.out.println("The weight in pound(s) is: "+pound);
		System.out.print("The weight converted in Kilograms is: "+kg +"kg");
	}
}
