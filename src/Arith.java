import java.util.Scanner;
class Arith
{
	public static void main(String []args)
	{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int A=a+b;
	int B=a-b;
	int C=a/b;
	int D=a%b;
	int E=a*b;
	System.out.println("sum is "+A);
	System.out.println("subis "+B);
	System.out.println("divison by / is "+C);
	System.out.println("div by % is "+D);
	System.out.println("mul is "+E);
	}
	
}