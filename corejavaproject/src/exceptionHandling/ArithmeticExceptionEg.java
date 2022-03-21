package exceptionHandling;
import java.util.*;
import java.io.*;
public class ArithmeticExceptionEg {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			if(b==0)throw new ArithmeticException();
			c=a*b;
			System.out.println("addition of two numbers:\t"+c);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero "+e);
		}
//		catch(IOException e) {
//			System.out.println(e);
//		}
		finally {
			sc.close();
		}
		
	}

}
