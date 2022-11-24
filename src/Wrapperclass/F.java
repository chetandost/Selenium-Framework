package Wrapperclass;

public class F {

	public static void main(String[] args) {
		String s="ELF39 oct15 saturday 2022";
		s=s.replace(" ", "");
		System.out.println(s);
		char c[]=s.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='0'&& c[i]<='9') {
				sum=sum+Integer.parseInt(c[i]+"");
			}
			
		}
		System.out.println(sum);
		
		
		

	}

}
