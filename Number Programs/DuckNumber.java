import java.util.Scanner;
class DuckNumber
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		String num= sc.next();
		int len=num.length();
		int cnt=0;

		for (int i=0;i<len ;i++ ) 
		{
			char dgt=num.charAt(i);
			if(dgt=='0')
				cnt++;
		}
		char dgt1=num.charAt(0);
		if(dgt1!='0'&&cnt>0)
			System.out.println(num+" is a duck number");
		else 
			System.out.println(num+" is not Duck Number");
	}
}