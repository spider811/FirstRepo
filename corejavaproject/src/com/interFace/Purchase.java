package com.interFace;
interface SbiBank{
	public void creditCard();
}
class MobileShop implements SbiBank{
	public void creditCard(){
		System.out.println("I purchased mobile");
	}
}
class Jewllery implements SbiBank{
	public void creditCard(){
		System.out.println("I purchased Jewllery");
	}
}
public class Purchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jewllery j= new Jewllery();
		MobileShop m= new MobileShop();
		j.creditCard();
		m.creditCard();
	}

}
