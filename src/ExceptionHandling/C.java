package ExceptionHandling;

public class C {

	public static void main(String[] args) {
		int a[]= {};
		try {
			a[1]=20;
			System.out.println(a[0]);
		}
		catch(ArithmeticException e) {
			System.out.println("handled");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(2);
		}
		catch(NullPointerException e) {
			System.out.println(3);
		}
		
		

	}

}
