// write a javaa program to design diceGame between two players
import java.util.Scanner;
import java.util.Random;

class Ludo 
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("welcome to the Ludo");
		System.out.println("enter the first player name");
		String p1=s.next();
		System.out.println("enter the second player name");
		String p2=s.next();
		int ptotal=0;
		int stotal=0;
		
	while(true)
	{
			while(true)
			{
				System.out.println(p1+"press p to play");

				char ch=s.next().charAt(0);
				if(ch=='P'||ch=='p')
				{
					int pscore=rd.nextInt(6)+1;
					System.out.println(p1+" score "+pscore);
				}
				if(ptotal+pscore<=100)
				{
					ptotal=ptotal+pscore;
					System.out.println(p1+" score "+ptotal);
				}
				if(ptotal==100)
				{	
					System.out.println(p1+" won the game "+ptotal);
					return ;
				}
				else
				{
				
					System.out.println(p1+" you loss the game  total score is "+ptotal);
				}
				break;
		

			System.out.println(p2+" press F to play");
	
				char ch1=s.next().charAt(0);
				if(ch1=='S'||ch1=='s')
				{
					int sscore=rd.nextInt(6)+1;
					System.out.println(p2+" score "+sscore);
						if(stotal+sscore<=100)
						{
							stotal=stotal+sscore;
							System.out.println(p2+" score "+stotal);
						}
						if(stotal==100)
						{
							System.out.println(p2+" won the game "+stotal);
							return;
						}
						else
						{
						
							System.out.println(p2+" total score is "+stotal);
						}
						break;
				}
			
			}
		}

		
	}
}