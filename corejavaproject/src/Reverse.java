import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Vedant";
		String ans=reverseStr(str);
		System.out.println(ans);
	}
	public static String reverseStr(String str){
		String ans="";
		for(int i=str.length()-1;i>=0;i--){
		ans=ans+str.charAt(i);
		}
		return ans;
		}
}
