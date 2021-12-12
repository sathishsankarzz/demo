// define a method to sum of cube of indivisual digits

import java.util.Scanner;
class CubeOfDigits
{
	static int cubeDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int t=n%10;
			sum=sum+t*t*t;
			n=n/10;
		}
		return sum;
	}
	public static void main(String []args)
	{
		int x=121,y=122;
		int s1=cubeDigits(x);
		System.out.println("sum of "+x+"  indiavisual cube number is"+s1);
		
		System.out.println("sum of "+y+" indiavisual cube number is "+cubeDigits(y));
	}
}