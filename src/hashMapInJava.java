import java.util.HashMap;
import java.util.MapEntry;
public class hashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap<>();
		hm.put(1001, "SHYA");
		hm.put(1002, "Prabu");
		hm.put(null, 's');
		hm.put(1003, "Prabu");
		hm.put(1003, "Riya");
		hm.put("Diya", null);
		System.out.println(hm);
		System.out.println("Value of 1003 is "+hm.get(1003));
		//hm.remove(null);
		//hm.remove(null, 's');
		hm.replace(1001, "Ani");
		hm.replace(null,'s',"Tara");
		System.out.println(hm);
		for(Map.Entry <Object, Object> ee:hm.entrySet()) {
			System.out.println(ee.getKey()+ " " +ee.getValue());
		}
		for(Object obj:hm.keySet()) {
			//System.out.println(obj);
			System.out.println("key " +obj+" "+"value "+hm.get(obj));
			}
		for(Object value:hm.values()) {
			System.out.println("values " + value);
		}
		
	}

}
