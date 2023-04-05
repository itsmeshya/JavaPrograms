package Intro.java.magnus;

public class MaxMinArray {

	public static void main(String[] args) {
	// Find the maximum number from the Array
		int a[]= {15,30,45,60,70,900,10};
		int maxNumber=a[0];
			for(int i=0;i<a.length;i++){// to find minimum no we need to chg i>a.length
			if(maxNumber<a[i])
			{
				maxNumber=a[i];
			}
		}	
		System.out.println(maxNumber);
	}
			
}
