import java.util.ArrayList;
import java.util.ListIterator;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList<>();
		al.add("SHYA");
		al.add(20.13f);
		al.add('f');
		al.add("SHYA");
		al.add(25);
		al.add(null);
		al.add(3, "PRABU");// add a element after a specific index
		System.out.println("al=" +al);
		
		ArrayList al1=new ArrayList<>();
		al1.add("RIYA");
		al1.add("DIYA");
		System.out.println("al1=" + al1);
		al.addAll(al1);// add all element from one array to another array
		al.addAll(4, al1);
		System.out.println("new al="+ al);
		//al.clear();
		//System.out.println("new al="+ al);
		System.out.println(al.contains("SHYA"));
		System.out.println(al1.containsAll(al));//find array has all the values are in the array
		System.out.println(al.get(1));//to get the specific value from the array thru index
		System.out.println(al.indexOf('f'));//to find the index for the value
		System.out.println(al.lastIndexOf("SHYA"));
		al.remove(6);//by using index
		al.remove(Integer.valueOf(25));//to remove the integer value
		al.remove(String.valueOf("PRABU"));
		System.out.println("new al=" +al);
		al.removeAll(al1);
		System.out.println(al);
		ListIterator li=al.listIterator();
		while(li.hasNext()) {
			Object obj=li.next();
			System.out.println("Iterator  "  +obj);
		}
	}
}
