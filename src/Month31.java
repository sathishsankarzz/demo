import java.util.Scanner;
class Month31
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enteer the month name");
		int s1=s.nextInt();
		switch(s1)
		{
			case 1: System.out.println("jan 31 days");
			break;
			case 2 : System.out.println("feb 30 days");
			break;
			case 3 : System.out.println("march 31 days");
			break;
			case 4 : System.out.println("april 30 days");
			break;
			case 5 : System.out.println("may 31 days");
			break;
			case 6 : System.out.println("june 30 days");
			break;
			case 7 : System.out.println("july 31 days");
			break;
			case 8 : System.out.println("agust 31 days");
			break;
			case 9 : System.out.println("sept 31 days");
			break;
			case 10 : System.out.println("oct 30 days");
			break;
			case 11 : System.out.println("nov 31 days");
			break;
			case 12: System.out.println("dec 30 days");
			break;
		} 
		if(s1==1||s1==3||s1==5||s1==7||s1==8||s1==10||s1==12||s1==2||s1==4||s1==6||s1==9||s1==11)
		{
			if(s1==1||s1==3||s1==5||s1==7||s1==8||s1==10||s1==12)
			{
				System.out.println(s1+" month has 31 days");
			}
			else
			{
				System.out.println(s1+" month has 30 days ");
			}
		}
		else
		{
			System.out.println(s1+" number is not valid ");	
		}

	}
}