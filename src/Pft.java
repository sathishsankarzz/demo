import java.util.Scanner;
class Pft
{
	static int checkPft(int r)
	{
		int i=1,sum=0,c=0;
		while(i<=r/2)
		{
			if(r%i==0)
			{
				sum=sum+i;
				c++;
			}
		}
		return sum;
		
	}
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		System.out.println("calling method");
		checkPft(n);
		System.out.println("work completed of method");
		/*System.out.println("method work completed");
		if(x==n)
		System.out.println(x+" is a perfect number");
		else
		System.out.println(x+" is not a perfect number");*/
	}
}