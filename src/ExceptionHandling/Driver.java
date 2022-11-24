package ExceptionHandling;
import java.util.Scanner;
public class Driver {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age<18) {
			throw new YoungerAgeException("you cant vote");
		}
		else {
			System.out.println("you can vote");
		}
		
		
	}
}


