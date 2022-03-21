package abstractClass;
abstract class Bank{
	abstract void checkBalance();
}
class Hdfc extends Bank{
	void checkBalance() {
		System.out.println("5000");
	}
}
class Sbi extends Bank{
	void checkBalance() {
		System.out.println("10000");
	}
}
public class BankAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank ref;
		Hdfc h= new Hdfc();
		ref=h;
		ref.checkBalance();
		Sbi s=new Sbi();
		
		ref=s;
		ref.checkBalance();
	}

}
