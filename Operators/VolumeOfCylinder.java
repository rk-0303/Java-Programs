import java.util.Scanner;
class  VolumeOfCylinder
{
	public static void main(String[] args) 
	{
		final double pi = 3.14;
		System.out.println("Enter radius of cylinder: ");
		Scanner sc = new Scanner(System.in);
		double rad = sc.nextDouble();
		System.out.println("Enter the heigth of the cylinder: ");
		double heigth = sc.nextDouble();
		double area = pi * rad * rad ;
		double vol = area * heigth;
		System.out.println("The area of cylinder is: "+area);
		System.out.print("The volume of cylinder is: "+vol);
	}
}
