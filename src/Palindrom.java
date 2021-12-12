import java.util.Scanner;
class Palindrom
{
	static int pal(int p)
	{
		int t,sum=0;
		while(p!=0)
		{
			t=p%10;
			sum=(sum*10)+t;
			p=p/10;	
		}
		return sum;
	}
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbr");
		int n=s.nextInt();
		int x=pal(n);
		if(x==n)
		System.out.println(x+"is a palindrom");
		else
		System.out.println(x+"is not a palindrom");
	}
}