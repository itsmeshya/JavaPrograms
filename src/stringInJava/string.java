package stringInJava;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Shyamala";
		//name="Riya";
		//String st=new String("Diya");
		System.out.println(name);
		System.out.println(name.charAt(1));
		System.out.println(name.length());
		System.out.println(name.equals("SHYA"));
		System.out.println(name.equalsIgnoreCase("SHYa"));
		System.out.println(name.isEmpty());
		System.out.println(name.contains("A"));
		System.out.println(name.substring(1));
		System.out.println(name.substring(1, 3));
		System.out.println(name.concat("mala"));
		System.out.println(name.replace("Sh", "Di"));
		System.out.println(name.indexOf("a"));
		System.out.println(name.indexOf('a', 4));
		System.out.println(name.trim());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(String.join("-","learn","Automation"));
		
		
	}

}
