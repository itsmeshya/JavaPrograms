import java.util.HashSet;

public class hashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet<>();
		hs.add("Kavi");
		hs.add('g');
		hs.add(null);
		hs.add(15);
		//hs.add(15);
		HashSet hs1=new HashSet<>();
		hs1.add(100);
		hs1.add(25);
		hs1.add('g');
		System.out.println(hs.add(25));//if we add duplicate, it will show true/false
		System.out.println(hs);
		//hs.contains('g');
		System.out.println(hs.contains('j'));
		hs.remove(15);
		System.out.println(hs);
		//hs.retainAll(hs1);
		System.out.println(hs);
		for(Object ob: hs) {
			System.out.println(ob);
			
		}
	}

}
