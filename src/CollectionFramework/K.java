package CollectionFramework;
import java.util.ArrayList;
import java.util.List;
public class K {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		ArrayList a1=new ArrayList();
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		a.retainAll(a1);
		System.out.println(a1);
		

}}

