package exceptionHandling;
import java.util.*;
public class MultiCatchExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		try {
			int n=sc.nextInt();
			if(99%n==0)
				System.out.println(n+" is a factor of 99");
		}
		catch(NumberFormatException | ArithmeticException | InputMismatchException ex) {
			System.out.println(ex);
		}
	}

}
