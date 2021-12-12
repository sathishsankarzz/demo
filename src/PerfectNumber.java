import java.util.Scanner;
class PerfectNumber
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter thee numbber ");
		int n=s.nextInt();
		int i=1,sum=0;
		while(i<=n/2)
		{
			if(n%i==0)
			sum=sum+i;
			i++;
		}
		if(n==sum)
		{
			System.out.println(sum+" is perfect numebr ");	
		}
		else
			System.out.println(sum+" is not a perfect numbr");
		
	}
}