import java.util.Scanner;
class Table
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the table number");
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(n+"x"+i+"="+n*i);
			i++;
		}

	}
}