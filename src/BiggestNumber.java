import java.util.Scanner;
class BiggestNumber
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the three digits ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a>b && a>c)
		System.out.println(a+" is greater one");
		else if(b>c)
		System.out.println(b+" is greater");
		else
		System.out.println(c+" greater one ");
		
		if(a>b && a<c || a>c && a<b)
		System.out.println(a+"middle value");
		else if(b>a && b<c)
		System.out.println(b+"middle value");
		else if(c>a && c<b)
		System.out.println(c+"middle value");
			
		System.out.println("smaller value");
		if(a<b && a<c)
		System.out.println(a+" is smaller");
		else if(b<c)
		System.out.println(b+"b is samler one ");
		else
		System.out.println(c+"c is smaller one");
		System.out.println("finding digit or not  value");
		if(a>=-9 && a<=9)	
		System.out.println(a+"a is digit ");
		else
		System.out.println(a+"is a number ");
	}
}