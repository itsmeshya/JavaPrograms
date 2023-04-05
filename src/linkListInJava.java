import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList<>();
		ll.add("Bhuvana");
		ll.add("Ravi");
		ll.add(99);
		ll.add(34.56d);
		ll.add(null);
		ll.add(2, "Ani");
		ll.addFirst("Riya");
		ll.addLast("Diya");
		
		System.out.println(ll);
		ListIterator itr=ll.listIterator();//is used to print one by one
		while(itr.hasNext()) {
			Object obj=itr.next();
			System.out.println(obj);	
			if(obj=="Ravi") {
				System.out.println("next index of Ravi " +itr.nextIndex());
				System.out.println("previous index of Ravi " +itr.previousIndex());
					}
		}
	}

}
