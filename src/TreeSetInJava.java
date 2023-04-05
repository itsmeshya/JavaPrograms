import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetInJava {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet<>();
		t.add(20);
		t.add(87);
		t.add(55);
		t.add(69);
		t.add(20);
		System.out.println("size of the tree set t=" +t.size());
		System.out.println(t);
		NavigableSet nav=t.descendingSet();
		System.out.println("Descending order" +nav);
		t.pollFirst();
		System.out.println(t);
		System.out.println(t.pollLast());
		//SortedSet s = t.headSet(70);//give all the values below 70
		//System.out.println(s);
		SortedSet ss = t.tailSet(20);//give all the values below 70
		System.out.println(t);
		System.out.println(ss);
		t.add(79);
		t.add(45);
		t.add(32);
		System.out.println(t);
		SortedSet s2=t.subSet(45, 80);
		System.out.println(s2);
	}

}
