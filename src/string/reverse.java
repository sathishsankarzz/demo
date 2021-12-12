package string;

public class reverse {

	
	public static void main(String[] args) {
		
		String a = "hello alexa";
		int count =0;
		String l = " ";
		int len = a.length();
		for(int i=len- 1;i>=0;i--)
		
			l = l+a.charAt(i);
		System.out.println("sttr:"+l);
		String sank = new StringBuilder (a).reverse().toString();
		System.out.println("reveresed string is given as "+sank);
		
		for (int j=0;j < a.length();j++)
		    if(a.charAt(j)!=' ')
				count++;
		System.out.println("the length is "+count);
	}

}
