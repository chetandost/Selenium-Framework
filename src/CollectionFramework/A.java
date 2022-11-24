package CollectionFramework;
import java.util.ArrayList;
public class A {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("chetan");
		a.add('c');
		a.add(12);
		a.add(true);
		System.out.println(a.size());//size method
		System.out.println(a.get(2));//get method
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));//chetanc12true
		}
	}}

	