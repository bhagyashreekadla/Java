import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size");
		 int size=scan.nextInt();
		 //array creation
		 int[] arr=new int[size]; 
		//array input
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("enter the elements of given size");
			 arr[i]=scan.nextInt();
		 }
		 //display original array
		 System.out.println("the original array is:");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]+" ");
		 }		 
		//display sorted array
		 Arrays.sort(arr);
		 System.out.println("the sorted array is:");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]+" ");
		 }
		 System.out.println("enter the key to search:");
		 int key=scan.nextInt();
		//binary search
		 int low=0;
		 int high=arr.length-1;
		 int mid=(low+high)/2;
		 while(low<=high) {
			 if(key==arr[mid]) {
				 System.out.println("key found");
				 return;
			 }
			 else if(key>arr[mid]) {
				 low=mid+1;
				 mid=(low+high)/2;
			 }
			 else if(key<arr[mid]) {
				 high=mid-1;
				 mid=(low+high)/2;
				 }
             }
			 System.out.println("key not found");	  
	     }	 
	}
	
  


