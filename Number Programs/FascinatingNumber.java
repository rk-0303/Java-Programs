class FascinatingNumber
{
	public static void main(String[] args) {
		
		int num=327;
		String str =num+""+(num*2)+(num*3);
		boolean flag= true;

		for (char i='1';i<='9' ;i++ ) // loop statrts from 1 to 9 characters
		{
			int cnt =0; // init char count is equals to zero for every new char
			//fetch char from string one by one from index 0
			for (int j=0;j<str.length() ;j++ ) 
			{
				char ch=str.charAt(j);//char fetched is stored in var ch
				if (ch==i)  // if i char matches with ch char if block executes
				     cnt++;  //incre the count if condtion satisfy
			}
			if (cnt!=1) // if cnt of char is not equals to 1 then if executes 
			{
				flag=false; // reinitialize the flag is cnt is not equals to 1 
				break;  // terminate the loop 
			}
		}
		if (flag)
		{
			System.out.println(num+" is a Fascinating Number");
		}
		else
		{
			System.out.println(num+" is not Fascinating number");
		}

	}
}