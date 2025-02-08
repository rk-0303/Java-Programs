import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		final float pi= 22/7;
		System.out.println("Please enter the Radius of the circle: ");
		Scanner sc= new Scanner(System.in);
		float rad= sc.nextFloat();
		float area = pi *rad*rad;
		float perimeter = 2 * pi * rad;
		System.out.println("Radius of the cricle :" +area +"cm^2");
		System.out.println("Perimeter of the cricle :" +perimeter +"2pir");
	}
}
