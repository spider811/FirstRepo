package com.interFace;

import java.util.Scanner;

interface input{
	public void read();
}
interface measure extends input{
	public void area();
}
class Triangle implements measure{
	int b, h;
	Triangle(){
		b=0;
		h=0;
	}
	public void read() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter base");
		b=sc.nextInt();
		System.out.println("Enter height");
		h=sc.nextInt();
	}
	public void area() {
		System.out.println("Area of triangle="+0.5*b*h);
	}
}
public class MultipeInterface{
	public static void main(String R[]) {
		Triangle t= new Triangle();
		t.read();
		t.area();
	}
	
	

}
