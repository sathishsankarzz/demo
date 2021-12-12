import java.util.Scanner;
import java.util.Random;
class DiceGame
{
	public static void main (String[]args)
	{
	Scanner s = new Scanner (System.in);
	Random  r =new Random();
	System.out.println("welcome to the dicegame ");
	System.out.println("enter first player name ");
	String firstname =s.next();
	System.out.println("enter second player name");
	String gname =s.next();
	int ftotal=0;
	int gtotal=0;
	while(true) 
	{
		while(true)
		{
		System.out.println(firstname+"press F to flip the dice");
		char c1 =s.next().charAt(0);
			if(c1=='F'||c1=='f')
			{
			int score =r.nextInt(6)+1;
			System.out.println(firstname+"you scored :"+score);
			if(ftotal+score<=100)
			ftotal=ftotal+score;
				if(ftotal==100)
				{
					System.out.println(firstname+" won the game");
					return;
				}
				else
				{
					System.out.println(firstname+" total score is:"+ftotal);
				}
				break;
			}
			else
			{
				System.out.println("your not pressed F or f");
			}
		}
		while(true)
		{
			System.out.println(gname+"press G to flip the dice");
			char c1 =s.next().charAt(0);
			if(c1=='G'||c1=='g')
			{
				int score =r.nextInt(6)+1;
				System.out.println(gname+"you scored :"+score);
				if(gtotal+score<=100)
				gtotal=gtotal+score;
				if(gtotal==100)
				{
					System.out.println(gname+" won the game");
					return;
				}
				else
				{
					System.out.println(gname+" total score is:"+gtotal);
				}
				break;
			}
			else
			{
				System.out.println("your not pressed G or g");
			}
		}
	}
	}
}