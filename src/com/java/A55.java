package com.java;
import java.util.Scanner;
public class A55 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int product=1;
		for(int i=number;i>=1;i--) {
			product=product*i;
			   }
		System.out.print(product);
		   }
		

	}



