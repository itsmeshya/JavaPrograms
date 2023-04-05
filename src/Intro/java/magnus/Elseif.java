package Intro.java.magnus;
public class Elseif {
	public static void main(String[] args) {
		int a=500, b=90, c=10;
		//Else if for which number is greater
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
		// Else if for bank
		String bankName = "SBI";
		
		if(bankName == "HDFC")
			System.out.println("Welcome to HDFC Bank");
		else if(bankName == "ICICI")
			System.out.println("Welcome to ICICI Bank");
		else if(bankName == "Kotak")
			System.out.println("Welcome to Kotak Bank");
		else if(bankName == "SBI")
			System.out.println("Welcome to SBI Bank");
		else if(bankName == "IDBC")
			System.out.println("Welcome to IDBC Bank");
	}

}
