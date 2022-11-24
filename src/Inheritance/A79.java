package Inheritance;

public class A79 extends A78{
	A79(int a){
		System.out.println(4);
	}
	{
		System.out.println(840);
	}
	static {
		System.out.println(12);
	}
	static {
		System.out.println(14);
	}
	A79(){
		this(1,1);
		System.out.println(5);
	}
	A79(int a, int b){
		super(1);
		System.out.println(6);
	}
	public static void main(String[]args) {
		System.out.println("main method");
		A79 c1=new A79();
		}

}
