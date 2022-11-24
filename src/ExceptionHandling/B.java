package ExceptionHandling;

public class B {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2/0);
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			System.out.println(5);
		}
		System.out.println(6);
		System.out.println(7);

	}

}


