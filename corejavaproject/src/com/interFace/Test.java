
package com.interFace;
interface Father{
	float ht1 =25.0f;
	public void height();
}
interface Mother {
	float ht2=20.0f;
	public void height();
}
class Child implements Father, Mother{
	public void height() {
		float ht=(Father.ht1+Mother.ht2)/2;
		System.out.println("Child's height="+ht);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch= new Child();
		ch.height();
	}

}
