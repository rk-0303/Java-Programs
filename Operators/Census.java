import java.util.Scanner;
class  Census
{
	public static void main(String[] args) 
	{
		long cp = 312032486;
		System.out.println("Current Population is: "+cp);
		long seconds = (365 * 24 * 60 * 60) * 5;
		long birth = seconds / 7;
		long death = seconds / 13;
		long imm = seconds / 45;
		System.out.println("No. of Seconds in 5 yrs: "+seconds);
		System.out.println("No. of  Births in next 5 yrs: "+birth);
		System.out.println("No. of Deaths in next 5 yrs: "+death);
		System.out.println("No. of Immigrants in next 5 yrs: "+imm);
		long np = cp + birth - death + imm;
		System.out.println("New population after 5 yrs: "+np);

	}
}
