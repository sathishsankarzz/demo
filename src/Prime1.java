import java.util.Scanner;
class Prime1
{
	
	static int checkPrime(int r)
	{
		int c=0;
		if(r%1==0&&r%r==0)
		{
			System.out.println("is a prime");
			c++;
		}
		else
		System.out.println("is not a prime  number");
		if(c!=0)
		System.out.println("true");
		else
		System.out.println("false");
		return r;
		
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		checkPrime(n);
	}
}