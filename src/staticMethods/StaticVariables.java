package staticMethods;

public class StaticVariables {

	  int a=20;
	  static int b=30;
	  void increment() {
		a=a+1;
		b=b+1;
		System.out.println("The value of a = " +a);//everytime creating a new obj
		System.out.println("The value of b = " +b);//static is using the same memory
	}
	public static void main (String[] args) {
		
		{
			StaticVariables v = new StaticVariables();
			v.increment();// a=21 b=31
			StaticVariables v1 = new StaticVariables();
			v1.increment();// a=21 b=32
			StaticVariables v3 = new StaticVariables();
			v3.increment();// a=21 b=33
			v.increment();// we are calling again s obj so it will be 22
							
		}
	}

}
