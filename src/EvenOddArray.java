import java.util.Scanner;
class EvenOddArray
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(Sytstem.in);
		System.out.println("enter the array size");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println(" enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
		
	}
}