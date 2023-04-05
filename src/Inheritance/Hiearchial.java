package Inheritance;

public class Hiearchial{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obja = new A(); //A can access only A method and variables
		obja.printData();
		B objb = new B();//B can access A and B method and variables
		objb.printData();
		objb.setData();
		System.out.println("A="+obja.a + " B="+objb.b);
		C objc = new C();//C can access A and C method and variables
		objc.printData();
		objc.getData();
		System.out.println("A="+objc.a + " C="+objc.c);	
	}
}
class A{
		int a=10;
		void printData() 
		{
		System.out.println("This is class A printData");
		}
}
class B extends A{
		int b=50;
		void setData() 
		{
			System.out.println("This is class B setData");
		}
}
class C extends A{
		int c=30;
		void getData()
		{
			System.out.println("This is class C getData");
		}
	}
	







