package exceptionHandling;

import java.util.Scanner;

//Try with the resource(introduced in java 1.7.0)
// handles exception by itself
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter 2 numbers");
		try(Scanner sc= new Scanner(System.in)){
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println(c);
		}
		
	}

}
