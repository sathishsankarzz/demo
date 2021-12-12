package string;

import java.util.HashMap;
import java.util.Iterator;

public class occurence {

	
 public static void main(String[] args) {
	 String a ="sAHFGHJSDGBVDXMVGASDBVMDBVBSEA";
	HashMap<Character,Integer> hMap  = new HashMap<>();
	for(int i =a.length() -1; i>=0;i--)
     if(hMap.containsKey(a.charAt(i)))
     {
    	 int count = hMap.get(a.charAt(i));
    	 hMap.put(a.charAt(i), ++count);
    			 }
     else
     {
    	 hMap.put(a.charAt(i),1);
     }
	System.out.println(hMap);
}
}
