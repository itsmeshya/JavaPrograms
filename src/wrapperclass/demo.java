package wrapperclass;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=new Integer(30);
		System.out.println(i);
		Byte b=new Byte((byte) 10);
		System.out.println(b);
		String s="Shya";//string literal
		String s1="Shya";
		String s2=new String("Shya");//always in heap memory new obj will be created
		String s4=new String("Shya");//string object
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s2==s4);
	}

}
