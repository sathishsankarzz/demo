// mwthods:-
import java.util.Scanner;
class Natural
{
	static void sumOfNatural(int n)// called method
	{	
		int sum=0;
		while(n>0)
		{
			sum=sum+n;
			n--;
		}
		System.out.println("sum is "+sum);
	}
	public static void main(String []args)// calling method
	{
		Scanner s=new Scanner(System.in);
		int n=5;
		sumOfNatural(n);
		System.out.println("--------------------");
		sumOfNatural(7);
		System.out.println("enteer the number ");
		int x=s.nextInt();
		sumOfNatural(x);
		System.out.println("--------------------");
		
		
	}
}