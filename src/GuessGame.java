import java.util.Scanner;
import java.util.Random;
class GuessGame
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numebr 0 to 9");
		int n=s.nextInt();
		Random rd=new Random();
		int rn=rd.nextInt(10);
		if(n==rn)
		System.out.println("you won the match"+rn);
		else
		System.out.println("you lose the match "+rn);
	}
}