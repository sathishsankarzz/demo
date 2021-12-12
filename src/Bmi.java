import java.util.Scanner;
class Bmi
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the hiegaht");
	double h=s.nextDouble();
	System.out.println("enter the weight i kgs");
	double w=s.nextDouble();
	int feet=(int)h;
	int inch=(int)((h-feet)*100);
	double m=(12*feet)*0.0254;
	double bmi=w/(m*m);
	System.out.println("Bmi is "+bmi);
	}
}