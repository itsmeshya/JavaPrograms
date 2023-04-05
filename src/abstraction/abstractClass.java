package abstraction;

public class abstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.printData();
		b.setData(60);
	}

}

abstract class A{
	int a=20;
	abstract void setData(int a);
	void printData(){
		System.out.println("a="+a);
	}
}
class B extends A{
	void setData(int b){
		 a=b;
		System.out.println("a="+a);
	}
}