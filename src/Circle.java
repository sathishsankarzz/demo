import java.util.Scanner;
class Circle
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radius of a circle");
		int R=s.nextInt();
		System.out.println("enter the radius of a circle");
		double c=2*3.14*R;
		double a=3.14*R*R;
		System.out.println("are of a circle is "+a+",circumference of a circle is "+c);
	
	}
}