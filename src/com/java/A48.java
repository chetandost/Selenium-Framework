package com.java;



import java.util.Scanner;
public class A48 {

	public static void main(String[] args) {
		Scanner chetu=new Scanner(System.in);
		char ch;
		System.out.println("Enter the character");
		ch=chetu.next().charAt(0);
		for(char ch1=ch;ch<='Z';ch++) {
			if(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U') {
				System.out.println(ch++ + "it is consonent");
			}
		}
			}
		}


