package abstraction;

public class Interface {

	public static void main(String[] args) {
		newUser n = new newUser();
		n.adduser();
		n.deleteuser();
		n.edituser();
	}
}
interface User{
	void adduser();
	void edituser();
	void deleteuser();
}
class newUser implements User{

	@Override
	public void adduser() {
		System.out.println("This is adduser method");
	}
	@Override
	public void edituser() {
		System.out.println("This is edituser method");
	}

	@Override
	public void deleteuser() {
		System.out.println("This is deleteuser method");
	}
}