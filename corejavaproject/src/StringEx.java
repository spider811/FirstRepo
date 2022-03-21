
public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc";
		String b= "abc";
		System.out.println("are two strings equal?"+(a==b));
		String c=new String("abc");
		String d= new String("def");
		System.out.println("are two strings equal?"+(c==d));
		System.out.println("are two strings equal?"+(a==d));
	}

}
