package com.java;

public class A87 extends A85 {
	void wheels() {
		System.out.println("4 wheels");
	}
	public static void main(String[]args) {
		A85 a1=new A85();
		//A86 a2=new A86();
		A87 a3=new A87();
		a1=a3;
		a1.wheels();
		
	}

}
