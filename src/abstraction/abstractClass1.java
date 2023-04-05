package abstraction;

public class abstractClass1 {
	public static void main (String[] args) {
		newusers n=new newusers();
		n.adduser("Shya", "Prabu", 1223456600);
		n.adduser1("Riya", "Prabu",234667740,"2323 drew RD");
	}
}
abstract class users{
	abstract void adduser(String fname,String lname,int mobile);
	
}
class newusers{
	void adduser(String fname,String lname,int mobile) {
		System.out.println("FirstName="+fname);
		System.out.println("LastName="+lname);
		System.out.println("MobileNumber="+mobile);
	}
	void adduser1(String fname,String lname,int mobile, String address) {
		 System.out.println("Address="+address);
	}
}
