import java.util.Scanner;
class NumberPattern6
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int p=s.nextInt();
		for(int i=1;i<=p;i++)
		{
			for(int j=1;j<=p;j++)
			{
				System.out.println(i%2);
			}
		}
	}
}