// write a java program return a factorial of numbrr
import java.util.Scanner;
class Factorial
{
	static int fact(int n)
	{
		int f=1,sum=0;
		while(n>0)
		{	int sum=0
			sum=sum+f*n;	
			n--;
		}
		return sum;
		
	}
		
	public static void main(String []args)
	{
		Scanner s=new Scanner();
		int n=5,y=8;
		System.out.println("factorila of "+y+" is "+fact(8));
		
	}
}