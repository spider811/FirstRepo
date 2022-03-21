package exceptionHandling;
import java.io.*;

public class firstExceptionExample {

	public static void main(String args[]) throws IOException {
		// TODO Auto-generated method stub
		int a,b,c;
		try {
			//it is ablock. It is a keyword
			DataInputStream dis= new DataInputStream(System.in);
			System.out.println("Enter first number");
			a=Integer.parseInt(dis.readLine());
			System.out.println("Enter second number");
			b=Integer.parseInt(dis.readLine());
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException se) {
			System.out.println("cannot divide by zero");
		}
				
	}

}
