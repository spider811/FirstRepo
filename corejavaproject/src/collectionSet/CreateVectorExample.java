package collectionSet;
import java.util.Vector;
import java.util.*;
public class CreateVectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(34);
		v.add('G');
		v.add("Capgemini");
		System.out.println(v);

		Vector<String> v1 = new Vector<String>();
		v1.add("Apple");
		v1.add("Banana");
		v1.add("Banana");
		System.out.println(v1);

		List<String> v2 = new Vector<String>();
		v2.add("BlUE");
		v2.add("GREEN");
		v2.add("RED");
		System.out.println(v2);

	}

}
