package Inheritance;

public class A78 {

	static {
		System.out.println(13);
	}
	{
		System.out.println(420);
	}
	A78(int a){
		this(1,2);
		System.out.println(1);
	}
	A78(){
		this(10);
		System.out.println(3);
	}
	public static void main(String[]args) {
		A78 c1=new A78();
	}
}
	
		

	


