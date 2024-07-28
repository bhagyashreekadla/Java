import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size");
		int size=scan.nextInt();
		//array creation
		int[] arr=new int[size];
		//array input
		System.out.println("enter the elements of size");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		//bubble sort
		for(int i=0;i<arr.length;i++) {

			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}

		}
		System.out.println("sorted array is");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");

		}
	}
}
