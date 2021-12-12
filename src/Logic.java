import java.util.Scanner;
class Logic
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.prinltn("enter the number");
		int n=s.nextInt();
		Switch(n % 2)
		{
			
			case 0:
			System.out.println(n+"even number");
			break;	
			case 1 :
			System.out.println(n+"odd number");
			break;
		}
	}
}