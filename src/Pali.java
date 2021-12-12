import java.util.Scanner;
class Pali
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=s.nextInt();
		int r=0,ss=n;
		while(n!=0)
		{
			int t=n%10;
			r=r*10+t;
			n=n/10;
		}
		if(r==ss)
		{
			System.out.println( " given number is a palidrom "+r);
		}
		else
		{
			System.out.println( " given number is not a palidrom "+r);
		}
	}
}