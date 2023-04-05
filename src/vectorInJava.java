import java.util.ArrayList;
import java.util.Vector;

public class vectorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v= new Vector();
		v.addElement(35);
		v.addElement("Tara");
		v.addElement(50.88);
		v.addElement(true);
		v.addElement("Mathi");
		v.addElement(35);
		v.add(1, "sankari");
		System.out.println("v="+v);
		
		System.out.println(v.contains(50.88));
		
		ArrayList al=new ArrayList();
		al.add(70);
		al.add("Ani");
		v.addAll(2, al);
		System.out.println("new v=" +v);
		v.remove(Integer.valueOf(35));
		System.out.println(v);
		for(Object obj:v) {
			System.out.println(obj);//to print one by one
		}
	}

}
