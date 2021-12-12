// pending ..................
import java.util.Scanner;
class Arm
{

	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		
		int sum=0,x=n;
		while(n>0)
		{
			int a=n%10;
			sum=sum+(a*a*a);
			n=n/10;
		}
		if(sum==x)
			System.out.println("armsrong number is "+sum);
		else
			System.out.println("not armsrong  "+sum);
		
	}
}