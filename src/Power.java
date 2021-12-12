// define a method to caluculate n to the power of p
import java.util.Scanner;
class Power
{
	static int pow(int x,int y)
	{
		int pw=1;
		while(y>0)
		{
			pw=pw*x;
			y--;	
		}
		return pw;
	
	}
	public static void main(String [] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first base value");
		int b=s.nextInt();
		System.out.println("enter the first power value");
		int p=s.nextInt();
		int q=pow(b,p);
		System.out.println("value is "+q);
		

		
	}
}