package com.interFace;
interface a{
	public void display();
}
class Sample implements a{
	public void display() {
		System.out.println("I am from sample method");
	}
}
public class RefrenceVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a x;	//--------> interface object
		Sample s= new Sample();
		x=s;	//here just object assigns to refrence to variable x 
		x.display();
	}

}
			