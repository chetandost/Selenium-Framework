package com.java;
import java.util.Scanner;
public class A46 {

	public static void main(String[] args) {
		Scanner chetu=new Scanner(System.in);
		System.out.println("Enter the start value");
		int start=chetu.nextInt();
		System.out.println("Enter the end value");
		int end=chetu.nextInt();
		for(int i=start; i<=end;i++) {
			if(i==10) {
				System.out.println(i);
			}
		}

	}

}

