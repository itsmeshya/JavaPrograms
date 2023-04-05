package stringInJava;

public class reverse {
	public static void main(String[] args) {
		String s="Shya";
		for(int i=s.length()-1;i>=0;i--) { //length()-1 is used to avoid error since index starts from0 and length starts from 1
			System.out.print(s.charAt(i));
		}
    }
}
