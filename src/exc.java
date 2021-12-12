
public class exc {
	int a=10,b=20;
	public  void col()
	{
		
		this.a= a+b;
		this.b=a-b;
		this.a=a-b;
     System.out.println(a+" "+b);
		
	}
	
	
	public static void main(String[] args) {

		exc cl = new exc();
		cl.col();
		
		
	}
}
