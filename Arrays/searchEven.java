package oops;
import java.util.*;
public class searchEven {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=scan.nextInt();
		int[] arr=new int[size];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the values of the index "+i);
			arr[i]=scan.nextInt();
		}
		System.out.println("even numers are");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			System.out.println(arr[i]);
			}
		}}	
}


