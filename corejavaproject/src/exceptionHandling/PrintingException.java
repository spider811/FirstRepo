package exceptionHandling;
import java.io.*;
public class PrintingException {
	public static void main(String R[])throws IOException {
		try {
			int a=10/0;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println();
			System.out.println(e.toString()); 
			System.out.println(e.getMessage());
		}
	}
}
