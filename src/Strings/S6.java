package Strings;

public class S6 {

	public static void main(String[] args) {
		String s1="My name is ram";
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			if(s2[i].equals("name")) {
				String s=s2[i];
				String rev="";
				for(int j=s.length()-1;j>=0;j--) {
					rev=rev+s.charAt(j);
				}
				s2[i]=rev;
			}
		}
		for(int i=0;i<s2.length;i++) {
			System.out.print(s2[i]+" ");
		}

	}

}
