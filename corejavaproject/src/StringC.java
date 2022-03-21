import java.util.*;
public class StringC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String x[]= new String[5];
		System.out.println("X arrayab");
		for(int i=0;i<5;i++) {
			x[i]=sc.nextLine();
		}
		System.out.println("Y array");
		String y[]= new String[5];
		for(int i=0;i<5;i++) {
			y[i]=sc.nextLine();
		}
		boolean b= Arrays.equals(x, y);
		System.out.println("are two arrays equal?"+b);
	}

}
