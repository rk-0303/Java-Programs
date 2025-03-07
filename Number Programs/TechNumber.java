class TechNumber 
{
	public static void main(String[] args) 
	{
		for (int num=1;num<5000 ;num++ )
		{
			int length=0;
			int div=1;
			
			for (int i=num;i>0 ;i/=10 )
			{
				length++;
			}
			if (length%2==0)
			{
				for (int i=1;i<=(length/2);i++ )
				{
					div*=10;
				}
				int fh=num/div;
				int lh=num%num;
				int sum=fh+lh;
				int sqr=sum*sum;

				if (sqr==num)
				System.out.println(num+" is tech number.");
			else 
				System.out.println(num+" is not tech number.");
			}
			
		}
	}
}
