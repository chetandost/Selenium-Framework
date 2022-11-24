package com.java;

public class A82 {

	public static void main(String[] args) {
		int num=132;
		int original=num;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==original)
		{
			System.out.println(original+" is a palindrome number");
		}
		else
		{
			System.out.println(original+" is not a palindrome number");
		}

	  }

      }



