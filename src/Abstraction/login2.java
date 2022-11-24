package Abstraction;

public class login2 extends login {
	
	void forgotpassword() {
		System.out.println("change password");
	}
	public static void main(String[]args) {
		login l1 = new login2();
		login2 l2 =(login2) l1;
		login2 l = new login2 ();
		l.forgotpassword();
		l2.forgotpassword();
		l2.username();
	}
	
	

}
