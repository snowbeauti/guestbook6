package com.javaex.num5;

public class Array_6_2 {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		// int[] a = {5,4,3,2,1};
		for(int i=0; i<a.length; i++) {
			a[i]= 5 -i;
			System.out.println("a["+ i + "]=" + a[i]);
		}

	}

}
