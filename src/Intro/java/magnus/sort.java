package Intro.java.magnus;

public class sort {
	public static void main(String[] args) {
		//int a=10;int b=15;int temp;
		//temp=a;
		//a=b;
		//b=temp;
		//System.out.println("a="+a+ " b="+b);
		int a[]= {10,8,15,20,5,4,25};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
				temp=a[i];	
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
	}
}