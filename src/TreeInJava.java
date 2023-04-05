import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tm= new TreeMap<>();
		tm.put(1001,"Prabu");
		tm.put(1002,  "Shya");
		tm.put(1003, "Riya");
		tm.put(1004, "Diya");
		//tm.put("shya",1006);
		System.out.println(tm);
		NavigableMap<Integer, Object> nm = tm.descendingMap();
		System.out.println(nm);
	}

}
