package abstractClass;

public class MyClass {
	void method(int x) {
		System.out.println("Square="+(x*x));
	}
	void method2(int x) {
		System.out.println("Cube="+(x*x*x));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m1=new MyClass();
		m1.method(5);
		MyClass m2=new MyClass();
		m2.method2(5);
		
	}

}
