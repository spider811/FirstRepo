package collectionSet;

import java.util.List;
import java.util.Vector;

public class vectorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		v.add(34);
		v.add('g');
		v.add("capgemini");
		System.out.println(v);
		Vector<String> v2= new Vector<>();
		v2.add("blue");
		v2.add("green");
		v2.add("red");
		System.out.println(v2);
		
		List<String> v3= new Vector<>();
		v3.add("blue");
		v3.add("red");
		v3.add("green");
		System.out.println(v3);
	}

}
