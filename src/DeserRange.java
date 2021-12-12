class DeserRange
{	
	static int checkDeseriumRange(int p,int q)//  hy
	{
		int sum=0,c=0;
		CheckdeseriumMethod d2=new CheckdeseriumMethod()
		
		for(int i=p;i<=q;i++)
		{
			boolean b=d2.checkDeserium(i);
			if(b==true)
			{
			System.out.println("deserium number is "+i);
			sum=sum+i;
			c++;
			}
		}
		System.out.println("the number of deseriums are "+c);
		return sum;
	}
}