import java.util.Scanner;
class EvenOrOdd
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");	
		int n=s.nextInt();
		System.out.println("by using % : ");
		if(n%2==0)
		System.out.println("even number");
		else
		System.out.println("odd number");

		System.out.println("by using /: ");
		if(n/2*2==n)
		System.out.println("even  number");
		else
		System.out.println("odd number");
		
		

	}
}
	