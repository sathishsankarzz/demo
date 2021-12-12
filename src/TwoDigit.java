import java.util.Scanner;
class TwoDigit
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numeber");
		int n=s.nextInt();
		int d1=n/10;
		int d2=n%10;
		int sum=(d1*d2)+(d1+d2);
		if(sum==n)
		{
			System.out.println(n+"is special two digit number");
		}
		else
		{
			System.out.println(n+"is not special two digit number");
		}
		System.out.println("thank you");
		
	}
}
//   input 59 output is special one............