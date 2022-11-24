package com.java;
import java.util.Scanner;
public class A63 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.print("enter the values into the array");
		for(int i=1;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	for(int i=1;i<a.length;i++) {
		if(a[i]%2==1) {
			System.out.println(a[i]+"it is odd");
		}
		}
	}

}
