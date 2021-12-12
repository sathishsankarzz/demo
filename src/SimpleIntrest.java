import java.util.Scanner;
class SimpleIntrest
{
	public static void main(String[]args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the principal value");
		int P=s1.nextInt();
		System.out.println("enter the time ");
		int T=s1.nextInt();
		System.out.println("enter the Rate");
		int R=s1.nextInt();
		int s=(P*T*R)/100;
		System.out.println("simple intrest is "+s);
	}
}