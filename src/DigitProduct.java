import java.util.Scanner;
class DigitProduct
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int mul=1,rr=n;;
		do
		{
			int t=n%10;
			mul=t*mul;
			n=n/10;		
		}while(n!=0);
		System.out.println(rr+" product of digits is "+mul);
	}
}