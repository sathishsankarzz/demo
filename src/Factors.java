// program to count how many factors or divisors for n
import java.util.Scanner;
class Factors
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
			}
		}
		System.out.println("no fo factors or divisors are "+f);
	}
}