package Inheritance;

public class Constructor {
	Constructor(){
		System.out.println("This is constructor");
	}
	Constructor(int a){
		System.out.println("The value of a " +a);
		System.out.println("This is 1 arg int constructor");
	}
	Constructor(short a){
		System.out.println("The value of a " +a);
		System.out.println("This is 1 arg short constructor");
	}
	Constructor(int a, int b){
		System.out.println("The value of a= " +a+ " and "+"b= "+b );
		System.out.println("This is 2 args constructor");
	}
	Constructor(float a, float b){
		System.out.println("The value of a= " +a+ " and "+"b= "+b );
		System.out.println("This is float args constructor");
	}
	public static void main(String[] args) {
		
		System.out.println("This is main method");
		Constructor c=new Constructor();
		Constructor c1=new Constructor(50);// it will take it as integer
		Constructor c2=new Constructor(20,45);
		Constructor c3=new Constructor(20.90f,15.89f);
		Constructor c4=new Constructor((short)25);//this is casting, we r casting int to short
		
	}

}
