package com.java;

public class A50 {

	public static void main(String[] args) {
		
		String d="12";
		System.out.println(d);
		int c[]= {1,2,3,4,5,6,7,8,9,10};
		int b=0, j=0;
		
		for(int i=0;i<c.length;i++) {
		
			if(c[i]%2==0) {
				b=b+c[i];
				
				
			}
			else {
				j=j+c[i];
			}
		}
		System.out.println(b);
		System.out.println(j);
		}
	}



