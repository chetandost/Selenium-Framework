package Strings;

public class S1 {

	public static void main(String[] args) {
		String s1="JAAVAA";
		int countA=0;
		int countV=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='A') {
				countA++;
		}
		else if(s1.charAt(i)=='V') {
			countV++;
		}
}

	System.out.println(countA);
	System.out.println(countV);
	}}


