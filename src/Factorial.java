// write a java program return a factorial of numbrr
import java.util.Scanner;
class Factorial
{
	static int fact(int n)
	{
		int f=1;
		while(n>0)
		{
			f=f*n;	
			n--;
		}
		System.out.println(f);
		return f;
		
	}
		
	public static void main(String []args)
	{
		
		int n=5,y=8;
		System.out.println("factorila of "+n+" is "+fact(n));
	
		System.out.println("factorila of "+n+" is "+fact(y));
		
		
	}
}