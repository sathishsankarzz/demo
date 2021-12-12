// check user enter number is happie (sum of square of indivisyal digits )number 
import java.util.Scanner;
class Happie
{
	static boolean isHappie(int p)
	{
		while(p>9)
		{
			int sum=0;
			while(p!=0)
			{

				int r=p%10;
				sum=sum+(r*r);
				p=p/10;
			}
			p=sum;
		}
		return (p==1||p==7);
	}
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		boolean H=isHappie(n);
		if(H==true)
		System.out.println(n+" is a happpie number");
		else
		System.out.println(n+" is not happie number");
		
	}
}
