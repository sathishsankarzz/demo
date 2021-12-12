import java.util.Scanner;
class Swtch
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int a=10;
		String s1=(n%2==0)?"even":"odd";
		System.out.println(n+"is"+s1+" number");
		switch(n%2)
		{
			
			case 0 : System.out.println(n+"even number");
			break;	
			case 1 : System.out.println(n+"odd number");
			break;
		}
	}
}