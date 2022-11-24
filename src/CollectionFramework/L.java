package CollectionFramework;
import java.util.Vector;
public class L {
	
	public static void main(String[]args) {
		Vector v=new Vector();
		v.add(10);
		v.addElement(20);
		v.add(10);
		v.add("chetan");
		System.out.println(v);
		for(Object o:v) {
			System.out.println(o);
		}
		
		
	}

}
