// write a program of sum of squares of digits 
import java.util.Scanner;
class DigitSquare
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int sum=0;
		while(n!=0)
		{
			int t=n%10;
			sum=t*t+sum;
			n=n/10;
		}
		System.out.println("sum of sqaures of digits "+sum);


	}

}