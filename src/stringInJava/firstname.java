package stringInJava;

public class firstname {

	public static void main(String[] args) {
	// replace the values of first name and last name
		//String name[]= {"Shyamala", "Devi", "Jayaraman"};
		firstname f=new firstname();
		f.name("Shyamala", "Devi", "Jayaraman");
		
		//String name[]= {"Riya", "S", "Prabu"};
		//System.out.println(name[2]+ " "+ name[1]+ " "+ name[0]);
	}
		String name(String a, String b, String c ) {
		String name[]= {"Riya", "S", "Prabu"};
		return (name[2]+ " "+ name[1]+ " "+ name[0]);
	}

}
