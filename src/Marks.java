import java.util.Scanner;
class Marks
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first subject marks");
		int a=s.nextInt();
		System.out.println("enter the seconds subject marks");
		int b=s.nextInt();
		System.out.println("enter the  subject marks");
		int c=s.nextInt();
		System.out.println("enter the first subject marks");
		int d=s.nextInt();
		if(a<35 || b<35 || c<35 || d<35)
		System.out.println("fail");
		
		int avg=(a+b+c+d)/4;
		if(avg>85)
		System.out.println(avg+"Distinction");
		else if(avg>65 && avg <85)
		System.out.println("first class");
		else if(avg>55 && avg <65)
		System.out.println("SEcond class");
		else if(avg>50 && avg<55)
		System.out.println("pass");
		else 
		System.out.println(avg+"fail");
		
		

	}
}