import java.util.Scanner;
class OddEven
{
	public static void main(String []args)
	{
		String s1[]={"even","odd"};
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numebr");
		int n=s.nextInt();
		System.out.println(n+"is"+s1[n%2]+"number");
	}
}
