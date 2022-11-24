package com.java;

public class A59 {

	public static void main(String[] args) {
		for(int rows=1;rows<=4;rows++) {
			for(int space=3;space>=rows;space--) {
				System.out.print(" ");
			}
			for(int column=1;column<=rows;column++) {
				System.out.print("*");
			}
		System.out.println();

	}}}


