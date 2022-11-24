package CollectionFramework;
import java.util.ArrayList;
public class F {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(true);
		a.add("hello");
		System.out.println(a);
		a.set(2, 120);
		System.out.println(a);
	}}
