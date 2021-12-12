// deserium number or not
// define a method to check the given number is armstrong or not 
import java.util.Scanner;

class Deserium
{
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
	
	
	static int pow(int x,int y)
	{
		int pw=1;
		while(y>0)
		{
			pw=pw*x;
			y--;	
		}
		return pw;
	
	}


	static int countDigit(int d)
	{	
		int c=0;
		while(d!=0)
		{
			c++;
			d=d/10;	
		}
		return c;
	}
	static int checkDeseriumRange(int p,int q)//  hy
	{
		int sum=0,c=0;
		for(int i=p;i<=q;i++)
		{
			boolean b=checkDeserium(i);
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

	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the starting range number");
		int m=s.nextInt();
		System.out.println("enter the ending range number");
		int n=s.nextInt();
		System.out.println("sum of deserium numbers is "+checkDeseriumRange(m,n));	
	}
}