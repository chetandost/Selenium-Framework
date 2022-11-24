package CollectionFramework;
import java.util.ArrayList;
public class C {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10);
		a.add("hello");
		a.add(true);
		a.add('a');
		System.out.println(a.indexOf(10));
		System.out.println(a.indexOf(true));
		System.out.println(a.lastIndexOf(10));
	}}
		
