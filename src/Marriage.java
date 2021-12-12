import java.util.Scanner;
class Marriage
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<n;i++)
		{
		
			if(i%3==0&&n%5==0)
			System.out.println("sanju weds Geetha");
			else if(i%3==0)
			System.out.println("sanju");
			else if(i%5==0)
			System.out.println("Geetha");
			else
			System.out.println(i);
		}
	}
}