import java.util.Scanner;
class Prime
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=s.nextInt();
		int f=1;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				f++;
				System.out.println(n+" is divided by "+i);
			}
			else
			{
				System.out.println(n+" is not  divided by "+i);
			}
			
		}
		if(f==2)
		System.out.println(n+" is a prime number, factors are "+f);
		else
		System.out.println(n+" not a prime number ");
		
		System.out.println("by while loop");
		int ff=1,j=1;
		while( j<=n/2)
		{
			if(n%j==0)
			{
			ff++;
			}
			j++;
		}
		if(ff==2)
		System.out.println(n+" is a prime number, factors are "+f);
		else
		System.out.println(n+" not a prime number ");
	}
}