import java.util.Scanner;
class  BillGenerator
{
	public static void main(String[] args) 
	{
		System.out.println("Enter subtotal: ");
		Scanner sc =new Scanner(System.in);
		float total =sc.nextFloat();
		System.out.println("Enter the Gratuity rate: ");
		float tip =sc.nextFloat();
		float gratuity = (tip * total)/ 100;
		float finalbill = total + gratuity;
		System.out.println("Your total bill is: "+finalbill);
		System.out.println("Tip added is: "+gratuity);

	}
}
