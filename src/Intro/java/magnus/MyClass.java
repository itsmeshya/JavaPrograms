package Intro.java.magnus;

public class MyClass {
	int rollNumber;
	String name;
	void setData(int rno, String sname)
	{
		rollNumber=rno;
		name=sname;
	}
	void printData()
	{
		System.out.println("studentName="+name+" rno="+rollNumber);
	}

}
