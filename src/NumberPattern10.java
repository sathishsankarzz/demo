import java.util.Scannar;
class NumberPattern10
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.println(" ")
			}
			for(int k=1;k<=n;k++)
			{
				System.out.println(k)
			}
		}
		
	}
}