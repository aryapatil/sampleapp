package sampleapp;

public class SalesClass {

	public void display() {
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length,i++)
			System.out.println(arr[i]);
				
		System.out.println("Array size:" + arr.length);
	}
	public void print() {
		System.out.println("Array numbers:");
		display();
	}
}
