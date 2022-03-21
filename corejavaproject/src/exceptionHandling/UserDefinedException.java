package exceptionHandling;
//import java.io.*;
//import java.util.*;
class Capgemini extends Exception{//it is a base class for all exception{
	
}
class Triangle{
	double b,h;
	Triangle(double l, double m){
		b=l;
		h=m;
	}

	public void area() throws Capgemini{
		if(b<0||h<0)throw new Capgemini();
			//System.out.println("nothing else");
		
		else 
			System.out.println("Area=\t"+0.5*b*h);
		
	}
}
public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t= new Triangle(2,3);
		try {
			t.area();
		}
		catch(Capgemini cap) {
			System.out.println(cap);
		}
	}

}
