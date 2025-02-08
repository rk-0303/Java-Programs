class  ReverseNumber
{
	public static void main(String[] args) 
	{
		int num =478;
		int dup = num;
		int rev = 0;  // Initialize reverse with 0;
		
		int rem = num%10; // to extract the last digit from given number
		rev =rev * 10 + rem;   // this implements as 0*10 + 8 ->8;
		num = num/10;

		rem = num%10; // to extract the last digit from given number
		rev =rev * 10 + rem;   // this implements as 8*10 + 7 ->87;
		num = num/10;
		 
		rem = num%10; // to extract the last digit from given number
		rev =rev * 10 + rem;   // this implements as 87*10 + 4 ->874;
		num = num/10;
		System.out.println("The reverse of the given number "+dup +" is: " +rev);
	}
}
