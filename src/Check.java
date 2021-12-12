import java.util.Scanner;
class Check
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String n=s.next();
		System.out.println("enter the name");
		String nn=s.next();
		System.out.println((n.equals(nn)));
			System.out.println((n==nn));
		char c='F';
		char c1='R';
			System.out.println((c==(c1)));
	
	}
}