package Encapsulation;

public class student1 {
	public static void main(String[]args) {
		student s1=new student(1,101,'A',"chetu");
		System.out.println(s1.getstandard());
		System.out.println(s1.getrollno());
		System.out.println(s1.getsection());
		System.out.println(s1.getname());
		System.out.println("=====================");
	
	student s2=new student(2,102,'B',"chetan");
	System.out.println(s2.getstandard());
	System.out.println(s2.getrollno());
	System.out.println(s2.getsection());
	System.out.println(s2.getname());
	System.out.println("=====================");
	
	student s3=new student(3,103,'c',"soma");
	System.out.println(s3.getstandard());
	System.out.println(s3.getrollno());
	System.out.println(s3.getsection());
	System.out.println(s3.getname());
	System.out.println("=====================");
	student s4=new student(4,104,'D',"sanku");
	System.out.println(s4.getstandard());
	System.out.println(s4.getrollno());
	System.out.println(s4.getsection());
	System.out.println(s4.getname());
	System.out.println("=====================");
	student s5=new student(5,105,'E',"basu");
	System.out.println(s5.getstandard());
	System.out.println(s5.getrollno());
	System.out.println(s5.getsection());
	System.out.println(s5.getname());
	System.out.println("=====================");
	}}