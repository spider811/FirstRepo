package exceptionHandling;

public class x1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,0};
		int n1,n2,result=0;
		n1=100;
		n2=0;
		try {
			result=n1/n2;
//			System.out.println(n1/a[2]);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("thank you");
		}
	}

}
