package com.java;

public class P1 {
			static int a=10;
			
			
			int b=20;

	public static void main(String[] args) {
		int a=20;//direct method
		System.out.println(a);
		P1 a1=new P1();//object creation
		System.out.println(a);
		int c=P1.a+a;//adding global & local variables(Non static+static members)
		System.out.println(c);
		

	}

}
