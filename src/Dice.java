import java.util.Scanner;
import java.util.Random;
class Dice
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to the Ludo Game");
		System.out.println("enter the First Player name");
		String p1=s.next();
		System.out.println("enter the First Player name");
		String p2=s.next();
		int ftotal=0;
		int stotal=0;
		Random r=new Random();
		while(true)
		{
			while(true)
			{
				System.out.println(p1+" enter F or f ");
				char ch=s.next().charAt(0);
				if(ch=='F'||ch=='f')
				{
					int score=r.nextInt(6)+1;
					System.out.println(p1+" you scored :"+score);
					if(ftotal+score<=100)
					{
						ftotal=ftotal+score;
						if(ftotal==100)
						{
							System.out.println(p1+" won the game :"+ftotal);
							return;
						}
						else
						{
							System.out.println(p1+" your score :"+ftotal);

						}
						break;
					}
				}
				else
				{
					System.out.println(" you r not entere the F or f :");
				}
			}



			while(true)
			{
				System.out.println(p2+" enter F or f ");
				char ch1=s.next().charAt(0);
				if(ch1=='F'||ch1=='f')
				{
					int score1=r.nextInt(6)+1;
					System.out.println(p2+" you scored :"+score1);
					if(stotal+score1<=100)
					{
						stotal=stotal+score1;
						if(stotal==100)
						{
							System.out.println(p2+" won the game :"+stotal);
							return;
						}
						else
						{
							System.out.println(p2+" your score :"+stotal);

						}
						break;
					}
				}
				else
				{
					System.out.println(" you r not entere the F or f :");
				}
			}


		}
		
	}
}