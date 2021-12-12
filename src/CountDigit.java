import java.util.Scanner;
class CountDigit
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int count=0;
		while(n>0)
		{
			int t=n%10;
			count++;
			n=n/10;
		}
		System.out.println(count+" digits are there");
	}
}