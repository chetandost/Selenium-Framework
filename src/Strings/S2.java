package Strings;
import java.util.Scanner;
public class S2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		String s2="";
		String s3=s1;
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		if(s3.equals(s2)) {
			System.out.println(s2+"it is not reversed");
		}
		else {
			System.out.println(s2+ " it is reversed");
		}

	}

}
