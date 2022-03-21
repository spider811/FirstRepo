package ListsInJava;
import java.util.*;
public class CreateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//without using generics
//		ArrayList list= new ArrayList();
//		list.add(10);
//		list.add("String");
//		System.out.println(list);
		
		
		
		//using generics
//		ArrayList<String> li= new ArrayList<>();
//		li.add("Banana");
//		li.add("apple");
//		li.add("jackfruit");
//		System.out.println(li);
		
		
		//combine two arrayList
//		ArrayList l= new ArrayList();
//		l.add(10);
//		l.add(25);
//		l.add(45);
//		ArrayList list= new ArrayList();
//		list.add("google");
//		list.add("yahoo");
//		l.addAll(list);
//		System.out.println(l);
		
		
		
		//add elements based on index positions
//		ArrayList al= new ArrayList<>();
//		al.add(2);		//0
//		al.add("ibm");	//1
//		al.add("tcs");	//2
//		al.add("5");	//3
//		al.add(10);		//4
//		System.out.println(al);
//		al.add(2,"JAVA");
//		System.out.println("After inserting--->"+al);
		
		
		
		//Arraylist check empty size contains
//		ArrayList<String> list= new ArrayList<>();
//		list.add("version");
//		list.add("mic");
//		list.add("apple");
//		list.add("sunmicrosystem");
//		list.add("oracle");
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
//		System.out.println(list.contains("apple"));
		
		
		
		//arraylist remove examples
//		ArrayList al= new ArrayList();
//		al.add(2);		//0
//		al.add("ibm");	//1
//		al.add("tcs");	//2
//		al.add("5");	//3
//		al.add(10);		//4
//		System.out.println(al);
//		al.remove(2);
//		System.out.println("After removing--->"+al);
//		al.remove("ibm");
//		System.out.println(al);
//		al.removeAll(al);
//		System.out.println(al);
//		System.out.println(al.size());
		
		
		
		
		//index
//		ArrayList al= new ArrayList<>();
//		al.add(2);		//0
//		al.add("ibm");	//1
//		al.add("tcs");	//2
//		al.add("5");	//3
//		al.add(10);		//4
//
//		System.out.println("Index of tcs is--->"+al.indexOf("ibm"));
		
		
		//lastIndexOf(H.W.)
		
		
		
		
		
		//retrieve elements from arraylist
//		ArrayList<String> al= new ArrayList<>();
//		al.add("banana");
//		al.add("apple");
//		al.add("pine apple");
//		al.add("grapes");
//		al.add("jackfruit");
		
		
//		//1.using for loop
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
//		
//		System.out.println("----------------------------------");
		
		
		
//		
//		//2.for each
//		for(String s:al) {
//			System.out.println(s);
//		}
//		
//		System.out.println("------------------------------------");
//		
		
//		
//		//3.iterator
//		Iterator<String> itr= al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println("----------------------------------");
		
		
		
		
//		//4.list Iterator
//		ListIterator ltr= al.listIterator();//listIterator method, predefined
//		while(ltr.hasNext()) {
//			System.out.println(ltr.next());
//		}
//		System.out.println("----------------------------------");
		
//		System.out.println("To print array in backward direction");
//		ListIterator<String> ltr= al.listIterator();
//		while(ltr.hasPrevious()) {
//			System.out.println(ltr.previous());
//		}		
		
		
		//5.foreach one liner
//		System.out.println("-----------------------------------");
//		al.forEach(fruits->System.out.println(fruits));
	}

}
