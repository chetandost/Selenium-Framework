package com.java;

public class A44 {

	public static void add(int a, boolean d) {
		System.out.println("addition");
	}
	public static void add(float b, int a) {
		System.out.println("subtraction");
	}
	public static void add(boolean c, double d) {
		System.out.println("multiplication");
	}
	public  void add(long c, int d) {
			System.out.println("division");
	}
	
	
	public static void main(String[]args) {
		add(10,true);
		add(10.112f, 12);
		add(true, 50.15);
		A44 a=new A44();
		a.add(123456, 12);
	}}
	
	

