package collectionSet;
import java.util.*;
public class JoiningTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("1");
		v.add("2");
		v.add("3");

		ArrayList a=new ArrayList();
		a.add("4");
		a.add("5");
		a.add("6");
		v.addAll(a);
		System.out.println(v);
	}

}
