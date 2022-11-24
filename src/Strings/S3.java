package Strings;

public class S3 {

	public static void main(String[] args) {
		String s1="AABBCC";String s2="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='A') {
				continue;
			}
			else {
				
				s2=s2+s1.charAt(i);
			}
		}
		s1=s2;
		System.out.println(s1);
	}

}
