package staticMethods;

public class StaticMethod1 {
	int a =20;
	static int b=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(b);
		StaticMethod1 sm=new StaticMethod1();
		System.out.println(sm.a);
		sm.m();
		m1();
	}	
		
		void m()
		{
			System.out.println("This is m method");
		}
		static void m1()
		{
			System.out.println("This is m1 method");
		}

}
