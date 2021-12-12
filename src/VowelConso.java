import java.util.Scanner;
class VowelConso
{
	public static void main(String []  args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the charecteers");
		char n=s.next().charAt(0);
		if(n=='i'||n=='o'||n=='a'||n=='u'||n=='e')
		System.out.println("charecterv is a vowels"+n);
		else
		System.out.println(n+"is a consonate");
		
		
	}
}