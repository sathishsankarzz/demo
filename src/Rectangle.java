import java.util.Scanner;
class Rectangle
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of rectangle :");
		int l=s.nextInt();
		System.out.println("enter the width of rectangle :");
		int b=s.nextInt();
		int a=l*b;
		int p=2*(l+b);
		System.out.println("area of rectangle :"+a+" ,perimter of a rectangle :"+p);
		
	}
}