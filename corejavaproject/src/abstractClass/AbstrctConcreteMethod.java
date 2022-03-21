package abstractClass;
abstract class Example{
	void method() {
		System.out.println("I am a method inside abstract class");
	}
}
class XYZ extends Example{
	
}
public class AbstrctConcreteMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ x= new XYZ();
		x.method();
	}

}
