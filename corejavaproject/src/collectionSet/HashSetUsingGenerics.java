package collectionSet;

import java.util.*;
public class HashSetUsingGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> hs = new HashSet<String>();
	      hs.add("Apple");
	      hs.add("Banana");
	      hs.add("PiNE Apple");
	      hs.add("JACKFRUIT");
	      hs.add("Apple");//Trying to add duplicate element
	     
	      System.out.println(hs);
	     
	      //1.way Using ForEach loop
	       for(String str:hs){    
	      System.out.println(str);
	       }
	       System.out.println(".........");
	       
	       //2.Iterator--->>It is an predefined interface
	       Iterator<String> itr=hs.iterator();
	       while(itr.hasNext()) {
	      System.out.println(itr.next());
	       }
	       System.out.println("........");
	       
	       
	       //for each()
	        hs.forEach(fruits-> System.out.println(fruits));
	 
	       
	     
	       
	       
	     
	}

}
