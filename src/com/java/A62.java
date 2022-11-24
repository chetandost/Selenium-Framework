package com.java;
import java.util.*;
public class A62 {

	public  int m1(int num) {
		int prod=1;
		while(num!=0) {
			int lastNo=num%10;
			prod=prod*lastNo;
			num=num/10;
		}
		return prod;
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the number");
			int a=sc.nextInt();
			A a1=new A();
			int result=a1.m1(a);
			System.out.println(result);
		}}

	


