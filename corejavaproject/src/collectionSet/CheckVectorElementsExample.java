package collectionSet;
import java.util.*;
public class CheckVectorElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v= new Vector<String>();
		v.add("Stephen");
		v.add("Suraj");
		v.add("Curry");
		v.add("Akila");
		v.add("Ashok");

		boolean b = v.contains("Stephen");
		System.out.println("Present in the class or not?:\t"+b);

		System.out.println(v.contains("Stephen"));

		v.set(2, "Capgemini");
		System.out.println(v);

	}

}
