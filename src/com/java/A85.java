package com.java;

public class A85 extends A84{

	int c=30;
	int d=40;
	public static void main(String[]args) {
		
		A84 cc = new A84();//parent
		A85 dc = new A85();//child
		
		cc=dc;//upcasting 
		 
		A85 b1 = (A85) cc;
		
		System.out.println(b1.a);
		
		Object o1 = new A85();//upcasting
		
		 A85 a1 = (A85) o1;//downcasting
		 System.out.println(a1.a);
		 System.out.println(a1.c);
		
	}}
	
