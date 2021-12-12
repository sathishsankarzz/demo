import java.util.Scanner;
class Avg
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,count =1,t;
		while(n!=0)
		{
			 t=n%10;
			 sum=sum+t;
			count++; 
			n=n/10;	
		}
		int avrg=sum/count;
		System.out.println(" "+avrg);
	}
}