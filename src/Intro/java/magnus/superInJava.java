package Intro.java.magnus;

public class superInJava {

	public static void main(String[] args) {
		//A a=new A();
		//a.print();
		 B b=new B();
		 b.print1();
		 
		
	}
}
class A{
	int a=10;
	void print() {
		System.out.println("a="+a);
	}
}
class B extends A{
	int a=25;
	void print1() {
		System.out.println("a="+a);
	}
}
class C extends B{
	
}


