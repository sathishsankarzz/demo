import java.util.Scanner;
class Armstrong
{
	
	static boolean checkArm(int r)
	{
		int sum=0,rr=r;
		while(r>0)
		{
			int a=r%10;
			sum=sum+(a*a*a);
			r=r/10;
		}
		return sum==rr;
	}
	
	static int sumArm(int s)
	{
		int add=0;
		add=add+s;
		return add;
		
	}

	static int printArm(int p,int q)
	{
		int sum=0,c=0;
		for(int i=p;i<=q;i++)
		{
			boolean b=checkArm(i);
			if(b==true)
			{
				System.out.println("arm strong numbers "+i);
				sum=sum+sumArm(i);
				c++;
			}
		}
		System.out.println("the no of arm strong numbers are "+c);
		return sum;
	}
	
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int m=s.nextInt();
		System.out.println("enter the number");
		int n=s.nextInt();
		//int ar=printArm(m,n);
		System.out.println("sum is "+printArm(m,n));
		
		
	}
}