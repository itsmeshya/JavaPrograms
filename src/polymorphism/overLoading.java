package polymorphism;

public class overLoading {
	public static void main (String args[]) {
		overLoading obj=new overLoading();
		//obj.add(15, 20);
		System.out.println("The value of add is "+ obj.add(30,20.5));
	}
	
	int add (int a,int b) {
		return a+b;
	}
	int add (int a,int b,int c) {
		return a+b+c;
	}
	float add (float a,int b,int c) {
		return a+b+c;
	}
	double add (int a,double b) {
		return a+b;
	}
	
}
