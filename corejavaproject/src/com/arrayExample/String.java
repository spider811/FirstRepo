package com.arrayExample;

import java.util.*;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int x[]=new int[n];
		System.out.println("X array");
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
		}
		int y[]=new int[n];
		System.out.println("Y array");
		for(int i=0;i<n;i++) {
			y[i]=sc.nextInt();
		}
		boolean b=Arrays.equals(x,y);
		System.out.println("Are two integer arrays equal?\t"+b);
	}

}
