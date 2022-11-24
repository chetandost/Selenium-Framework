package Encapsulation;

public class E1 {
	
	
	private String name;
	private double balance=1000.0;
	public E1(String name) {
		this.name=name;
	}
	public String getname() {
		return this.name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setbalance(double amt) {
		balance=balance+amt;
	}
}
