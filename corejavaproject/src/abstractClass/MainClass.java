package abstractClass;
import java.util.*;

abstract class Abstrct{
	abstract void cal(double x);
}
class Sub1 extends Abstrct{
	public void cal(double x) {
		System.out.println("Square="+(x*x));
	}
}
class Sub2 extends Abstrct{
	public void cal(double x) {
		System.out.println("Cube="+(x*x*x));
	}
}
class Sub3 extends Abstrct{
	public void cal(double x) {
		System.out.println("SquareRoot="+Math.sqrt(x));
	}
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub1 s1= new Sub1();
		Sub2 s2= new Sub2();
		Sub3 s3= new Sub3();
		s1.cal(2);
		s2.cal(3);
		s3.cal(100);
	}

}
