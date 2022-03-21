package com.arrayExample;
import java.util.Arrays;
import java.util.Scanner;
public class StringComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("X array");
		String x[]=new String[5];
		
		for(int i=0;i<x.length;i++) {
			x[i]=sc.nextLine();
		}
		System.out.println("Y array");
		String y[]=new String[5];
		
		for(int j=0;j<y.length;j++) {
			y[j]=sc.nextLine();
		}
		boolean b=Arrays.equals(x,y);
		System.out.println("Are two integer arrays equal?\t"+b);
		sc.close();
	}

}
