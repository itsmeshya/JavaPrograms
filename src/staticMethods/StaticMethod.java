package staticMethods;

public class StaticMethod {

	public static void main(String[] args) {
		
		StaticMethod obj=new StaticMethod();
		obj.display1();
		System.out.println("This is main method");
		show();
}
	void display() {
		System.out.println("This is display method");		
		}
	void display1() {
		System.out.println("This is display1 method");
		display();
		
		}
	static void show() {
		System.out.println("This is show method");
	}
	
}


