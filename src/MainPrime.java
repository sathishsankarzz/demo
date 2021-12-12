// print prime numbers betwwen 1 to n
import java.util.Scanner;
class MainPrime
{
	static boolean checkPrime(int r)
	{
		int j=2;
		while(j<=r/2)
		{
			if(r%j==0)
			{
				return false;
			}
			else
			{

				j++;
			}
			
		}
		return true;
	}
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int c=0,sum=0;
		for(int i=2;i<=n;i++)
		{
			boolean rs=checkPrime(i);
			if(rs==true)
			{
			sum=sum+i;
			System.out.println(i);
			c++;
			}
		}
		System.out.println(c+" numbrs are there ");
		System.out.println(n+" all prime numbers sum is "+sum);
		
	}
}

