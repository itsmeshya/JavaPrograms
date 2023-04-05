package Intro.java.magnus;

public class MyMethod {

	public static void main(String[] args) {
		MyMethod mm=new MyMethod();
		//mm.sum(25, 35);
		//mm.sum(40, 90);
		int result=mm.sum(10,100)-10;
		System.out.println("Result="+result);

	}
	int sum(int a,int b) 
		{
		//int a=20;
		//int b=10;
		int c=a+b;
		//System.out.println(c);
		return c;
		}
}
