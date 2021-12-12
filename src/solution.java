import java.util.*;
class solution
{
	
public int Solution(int[] num) {
  int changesWithLeading0 = 0;
  int changesWithLeading1 = 0;
  int i,b=0;
for ( i = 0; i < num.length; i++) {
    if (num[i] == 1 - (i % 2)) {
      changesWithLeading0 ++;
    }
    if (num[i] == i % 2) {
      changesWithLeading1 ++;
    }
  }
 b= Math.min(changesWithLeading0, changesWithLeading1); 
  return b ;
  
  
}	



public static void main(String[] args) {
		
		int a[] = {1,1,0,1,1};
	//	solution b= new solution();
	//	b.solution(a);*/
	

    /*Scanner sc = new Scanner(System.in);
    		int a = sc.nextInt();
        int[] n=new int[a];
        for(int i =0 ;i<a;i++)
        {
          n[i]=sc.nextInt();
        }*/

	int[] n=new int[100];
		solution b= new solution();
		System.out.println(b.Solution(a));
	
	}

	
	}
