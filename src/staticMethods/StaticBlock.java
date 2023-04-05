package staticMethods;

public class StaticBlock {
	{
		System.out.println("this is Instance Block");
	}
	static
	{
		System.out.println("this is static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock sb= new StaticBlock();
		System.out.println("main starts");
		System.out.println("main ends");
	}

}
