import java.util.Scanner;
class SumOfFactorialOfIndidual
{
	static int factInd(int r)
	{	
		int f=1;
		while(r!=0)
		{
			f=f*r;
			r--;
		}
		return f;	
	}
		

	static int factSum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int t=n%10;
			sum=sum+factInd(t);
			n=n/10;
		}
		return sum;
	}
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int x=s.nextInt();
		System.out.println("sum of factorial of indidual digit is "+factSum(x));
		int y=factSum(x);
		if(y==x)
		System.out.println(factSum(x)+" is a strong number");
		else
		System.out.println(factSum(x)+" is not a strong number");
	}
	
}
