package QueueJava;
import java.util.*;
public class CreatePriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue p= new PriorityQueue();
		p.add(2);
		p.add(10);
		p.add(11);
		//p.add('p');
		//p.add("google");
		System.out.println(p);
		
		Queue p2= new PriorityQueue();
		p2.add(1);
		p2.add(20);
		p2.add(17);
		p2.add(7);
		System.out.println(p2);
	}

}
