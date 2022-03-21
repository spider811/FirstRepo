
public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s4=s1;
		System.out.println("address of s1 and s4 are equal? "+s1==s4);
		String s2="Welcome";
		String s3=s1.concat(" "+s2);
		System.out.println("concatenation of 2 strings is: "+s3);
		//length
		int n=s3.length();
		System.out.println("length of String is: "+n);
		
	}

}
