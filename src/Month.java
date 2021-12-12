// read month number from the user and print coreesponbding  name 
import java.util.Scanner;
class Month
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		switch(n)
		{
			case 1:System.out.println("jan "+n );
			break;

			case 2:System.out.println("feb "+n );
			break;

			case 3:System.out.println("march "+n );
			break;

			case 4:System.out.println("april "+n );
			break;

			case 5:System.out.println("may "+n );
			break;

			case 6:System.out.println("june "+n );
			break;

			case 7:System.out.println("july "+n );
			break;

			case 8:System.out.println("agus "+n );
			break;

			case 9:System.out.println("sep "+n );
			break;

			case 10:System.out.println("octo "+n );
			break;

			case 11:System.out.println(" nov"+n );
			break;

			case 12:System.out.println("dec"+n );
			break;
			default :System.out.println("default value "+n );
	
			
		}									
	}
}