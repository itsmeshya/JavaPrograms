package Intro.java.magnus;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticMethod sm=new StaticMethod();
		//sm.display();
		//StaticMethod.show();
		MyClass m=new MyClass();
		System.out.println(m.rollNumber);
		System.out.println(m.name);
		m.setData(1, "shya");
		m.printData();
	}
}
