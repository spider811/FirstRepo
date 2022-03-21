package collectionSet;
import java.util.*;
public class RemoveElementVectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("Stephen");
		v.add("Curry");
		v.add("Rohit");
		v.add("Sharma");
		System.out.println(v.remove("Curry"));//True
		System.out.println(v.removeElement("Rohit"));
		System.out.println(v);

		v.clear();
		System.out.println(v);
	}

}
