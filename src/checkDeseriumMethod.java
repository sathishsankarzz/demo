class checkDeseriumMethod
	static boolean checkDeserium(int r)
	{	
		int dc=countDigit(r);
		int sum=0,rr=r;
		while(r!=0)
		{
			int t=r%10;
			sum=sum+pow(t,dc);
			r=r/10;
			dc--;
		}
		return sum==rr;
	}
	
	