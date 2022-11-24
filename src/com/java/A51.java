package com.java;

public class A51 {
	
	public static void main(String[]args) {
	
	int a[]= {10,1,3,99,101};
	int largest=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<largest) {
			largest=a[i];
		}
	}
	System.out.println(largest);
			
		}
	}
	
	

