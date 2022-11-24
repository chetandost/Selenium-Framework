package com.java;
import java.util.Scanner;
public class A53 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int a[]=new int[sc.nextInt()];
		a[0]=10;
		a[1]=19;
		a[2]=17;
		a[3]=11;
		a[4]=9;
		a[5]=61;
		int b=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				b++;}
		}
			System.out.println(b);
		}

	

}


