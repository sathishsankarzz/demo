import java.util.Scanner;
class Logic1
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		int n=s.nextInt();
		int t=s.nextInt();
		int r=s.nextInt();
		if(n>t&&n>r)
		System.out.println("n value "+n);
		else if(t>n&&t>r)
		System.out.println("t value "+t);
		else
		System.out.println("r value "+r);
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a>>2);
		System.out.println(a<<2);
		System.out.println(a>>>2);
		System.out.println(b>a&&b>c);
		System.out.println(a>b&&a>c);
		System.out.println(  
);
		
	}
}