package staticMethods;

public class StaticClass {

	public static void main(String[] args) {
		//firstClass.secondClass.display();
		firstClass.secondClass obj=new firstClass.secondClass();
		obj.display1();

	}

}
class firstClass{
	static class secondClass{
		//static void display() {
		//System.out.println("This is inner class");
		void display1() {
			System.out.println("This is innerclass1");
		}
	}
}