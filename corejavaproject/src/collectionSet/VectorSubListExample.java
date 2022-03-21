package collectionSet;
import java.util.*;
public class VectorSubListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector  v =new Vector();
		v.add("Colour");
		v.add("Red");
		v.add("Green");
		v.add("Image");
		v.add("Blue");
		v.add("Maroon");
		v.add("Yellow");
		v.add("White");

		List list=v.subList(1,4);
		System.out.println(list);
	}

}
