package Intro.java.magnus;
public class Operators {
	public static void main(String[] args) {
			//Assignment operators is nothing but assigning the value =
		int a=30, b=40, c=12, d=3;
				{
			//Arithmetic operators  + - * / % ++ --		
			System.out.println(a+b + " is the sum of a and b");
			System.out.println(a-b + " is the sub of a and b");
			System.out.println(a*b + " is the product of a and b");
			System.out.println(a/b + " is the divide of a and b");
			System.out.println(a%b + " is the reminder of a and b");
			System.out.println(a++);//post increment
			System.out.println(a);
			System.out.println(++b);//pre increment
			System.out.println(b);
			System.out.println(--c);
			System.out.println(d--);
			System.out.println(d);
			//Relational operators < > <= >= == !=
			System.out.println(a<b);
			System.out.println(a>b);
			System.out.println("Value of a is " +a);
			System.out.println("Value of b is " +b);
			System.out.println("Value of c is " +c);
			System.out.println(a==b);
			System.out.println(a!=b);
			//Logical operators && ||
			System.out.println(true && true);
			System.out.println(a>b && b>c); // t t=t, t f=f, f t=f, f f =f
			System.out.println(a>b || b>c); // t t=t, t f=t, f t=t, f f =f
			//Conditional operator ? : 
			System.out.println(a>b?a:b); //if cond a>b satisfy print ?a and not satisfy print :b
			//Bitwise operators & | ^ << >>
			System.out.println(3 & 7); // it will return true when both values are 1
			System.out.println(3 | 5); //it will return true even one value is 1
			System.out.println(3 ^ 5); //Xor will return 1 if both are not match
			System.out.println(4 << 3);
			System.out.println(7 >> 3); //00000111 moves 111 to the right make 000 so 00000000
			//Compound assignment operators += -= *= /= %=
			int k=20;
			System.out.println(k+=5);
			System.out.println(k-=5);
			System.out.println(k*=5);
			System.out.println(k/=5);
			System.out.println(k%=5);
			}
	}

}
