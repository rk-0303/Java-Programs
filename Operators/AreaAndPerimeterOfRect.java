import java.util.Scanner;
class AreaAndPerimeterOfRect
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the width of the rectangle: ");
		Scanner sc = new Scanner (System.in);
		float width = sc.nextFloat();
		System.out.println("Enter the height of the rectangle: ");
		float height =sc.nextFloat();
		float area = width * height;
		float perimeter = (height + width) * 2;
		System.out.println("Area of given rectangle is : "+area);
		System.out.println("Perimeter of given rectangle is : "+perimeter);
	}
}
