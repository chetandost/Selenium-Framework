package com.java;

public class A42 {

	static int i=1;
	public static void EvenNumber()
	{
		for(int i=1;i<=10;i++)
			if(i%2==0)
			{  
				System.out.print(i);
			}
		System.out.println();
	}
	public void oddNumber()
	{
		for(int i=1;i<=10;i++)
			if(i%2==1)
			{
				System.out.print(i);
			}
	}
		public static void main(String[]args) {
			A42.EvenNumber();
			A42 a=new A42();
			a.oddNumber();
		}}

		

	

