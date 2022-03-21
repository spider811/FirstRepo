package collectionSet;
import java.util.*;
public class VectorIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		v.add("Welcome");
		v.add("to");
		v.add("vector");
		v.add("in");
		v.add("java");
		v.add(4);
		
		
		
		//for-loop
		System.out.println("**for loop**");
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("------------------------------------");
		
		
		
		//for-each
		System.out.println("**for each**");
		Vector<String> v2= new Vector<>();
		v2.add("Welcome");
		v2.add("to");
		v2.add("vector");
		v2.add("in");
		v2.add("java");
		for(String s:v2) {
			System.out.println(s);
		}
		System.out.println("---------------------------------------");
		
		
		
		//for each one liner
		System.out.println("**for each one liner**");
		v.forEach(p->System.out.println(v));
		
		
		
		//iterator
		System.out.println("**using iterator**");
		Iterator value= v2.iterator();
		while(value.hasNext()) {
			System.out.println(value.next());
		}
		System.out.println("----------------------------------------");
		
		
		
		//List-Iterator
		System.out.println("**List Iterator**");
		ListIterator li= v2.listIterator();
		System.out.println("***1. forward iteration: ***");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("***2. backward iteration:***");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
