package CollectionFramework;
import java.util.ArrayList;
public class D {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(true);
		a.add("chetan");
		for(Object o:a) {
			System.out.println(o);
		}
	}}

