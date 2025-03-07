class RecSumOfDigit 
{
	public static int RecSumOfDigit(int num, int sum)
	{
		if (num==0)
		{
			return sum;
		}
		return RecSumOfDigit(num/10, sum+=num%10);
	}
	public static void main(String[] args) 
	{
		System.out.println(RecSumOfDigit(123,0));
	}
}
