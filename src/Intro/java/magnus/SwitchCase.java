package Intro.java.magnus;

public class SwitchCase {

	public static void main(String[] args) {
		int a=55, b=50;
		int option=2;
		
		switch(option) {
		case 1:
			System.out.println("Add " + (a+b));
			break;
		case 2:
			System.out.println("Sub " + (a-b));
			break;
		case 3:
			System.out.println("Multiply " + (a*b));
			break;
		case 4:
			System.out.println("Divide " + (a/b));	
			break;
		default:
			System.out.println("Enter option 1 to 4");
		}
	}
}
