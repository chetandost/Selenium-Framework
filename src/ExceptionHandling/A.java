package ExceptionHandling;

public class A {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(1/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled");
		}
		System.out.println(3);
		System.out.println(4);

	}

}
