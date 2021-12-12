// one person had a money with that how many product can he buy and how reamining he had 
import java.util.Scanner;
class Prdct
{
	public static void main(String []args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the money we have");
		int n=s.nextInt();
		System.out.println("ente the product value");
		int p=s.nextInt();
		int nn=n/p;
		int nnn=n%p;
		System.out.println("product can by "+nn);
		System.out.println("remining money is "+nnn);
		
	}
}