import java.util.Scanner;
class VoteEligible
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		if(n>=18)
		System.out.println("is eleigible to vote");
		else
		System.out.println("is not eligle");
		
	}
}