package stringInJava;

public class palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//palindrome p= new palindrome();
		//p.rev();
	
			String s="Shya";
			String reverse="";
			//void rev() {
			for(int i=s.length()-1;i>=0;i--) { //length()-1 is used to avoid error since index starts from0 and length starts from 1
				reverse +=s.charAt(i);
				System.out.println(reverse);
				
			//}
	    
			//for (int i=0; i<s.length();i++) {
				if(s.charAt(i)!=reverse.charAt(i)) {
					System.out.println("not panlindrome");
				}
					else {
						System.out.println("panlindrome");
					}
				}
	}
}
