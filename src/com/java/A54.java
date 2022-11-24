package com.java;
import java.util.Scanner;
public class A54 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a=sc.nextInt();
		char ch[]=new char[a];
		   for(int i=0;i<ch.length;i++) {
			   System.out.println("Enter the characters of the array");
			   ch[i]=sc.next().charAt(0);
		   }
		   System.out.println("the vowels are");
		   for(int j=0;j<ch.length;j++) {
			   if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u') {
				   System.out.print(ch[j]+" ");}
			  
			   }
		   }
		

	}


