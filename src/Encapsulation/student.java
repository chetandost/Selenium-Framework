package Encapsulation;

public class student {

	
	private int standard;
	private long rollno;
	private char section;
	private String name;
	
	public student(int standard,long rollno,char section,String name) {
		this.standard=standard;
		this.rollno=rollno;
		this.section=section;
		this.name=name;
		
	}
	public int getstandard() {
		return this.standard;
	}
	public long getrollno() {
		return this.rollno;
	}
	public char getsection() {
		return this.section;
	}
	public String getname() {
		return this.name;
	}
	public void setstandard() {
		 this.standard=standard;
	}
	public void setrollno() {
		 this.rollno=rollno;
	}
	public void setsection() {
		 this.section=section;
	}
	public void setname() {
		this.name=name;
	}
	
}
