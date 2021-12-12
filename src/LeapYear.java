// write a java program to cjeck user enter year is leap year or not 
import java.util.Scanner;
class LeapYear
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int n=s.nextInt();
		if(n%400==0 || n%4==0 && n%100!=0)
		System.out.println("Leap year");
		else 
		System.out.println("not Leap year");
		

	}
}