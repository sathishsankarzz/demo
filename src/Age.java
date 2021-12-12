import java.util.Scanner;
class Age
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		String n=s.nextLine();
		System.out.println("enter your age");
		int a=s.nextInt();
		System.out.println("what is u r percentage in betch");
		float p=s.nextFloat();
		System.out.println("Nmae: "+ n +" Age is : "+a+" btech :"+p);
	}
}