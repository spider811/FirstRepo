import java.util.*;

interface X { 
public void method1();
public static void method2() { System.out.println("Method2"); }
public default void method3() { System.out.println("Method3"); } }
public class Assessment {

	static int i;int j;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assessment a=new Assessment();
		Assessment b=new Assessment();
		a.i = 2; a.j = 3;
		b.i= 5; b.j = 6; 
		System.out.println(""+a.i+ " "+a.j+ " "+b.i+ " "+b.j);
	}

}
