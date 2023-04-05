package abstraction;

public class Interface1 {

	public static void main(String[] args) {
		newMethod n= new newMethod();
		n.add(20, 55);
		n.sub(45, 20);
		n.multiply(10,15);
		n.division(60, 10);
	}
}
interface method{
	void add(int a, int b);
	void sub(int a, int b);
	void multiply(int a, int b);
}
interface method1{
	void add(int a, int b);
	void division(int a, int b);
	void reminder(int a, int b);
}
class newMethod implements method, method1{

	@Override
	public void add(int a, int b) {
		int sum=a+b;
		System.out.println("Addition of a and b is "+sum);
	}

	@Override
	public void sub(int a, int b) {
		int sub=a-b;
		System.out.println("Subtract of a and b is "+sub);
	}

	@Override
	public void multiply(int a, int b) {
		int multiply=a*b;
		System.out.println("Product of a and b is "+multiply);
	
	}
	@Override
	public void division(int a, int b) {
		int divide=a/b;
		System.out.println("Division of a and b is "+divide);

	}

	@Override
	public void reminder(int a, int b) {
		int remind=a%b;
		System.out.println("Remindeer of a and b is "+remind);
	}
}