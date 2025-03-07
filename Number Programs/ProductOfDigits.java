class  ProductOfDigits
{
	public static void main(String[] args) 
	{
		int num=2345;
		int prod =1;

		int rem = num %10; //5
		prod = prod * rem; //5
		num = num/10; //234
		
		rem = num %10; 
		prod = prod * rem;
		num = num/10;

		rem = num %10;
		prod = prod * rem;
		num = num/10;

		rem = num %10;
		prod = prod * rem;

		System.out.println("The product of digits is : "+prod);
	}
}
