package CollectionFramework;
import java.util.ArrayList;
public class B {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(true);
		a.add("chetan");
		a.add(3);
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		a.remove(true);
		System.out.println(a);
		a.remove(new Integer(10));
		System.out.println(a);
	}}
