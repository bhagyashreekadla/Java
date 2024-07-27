package oops;
import java.util.*;
public class AddArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size");
		 int size=scan.nextInt();
		 int[] arr1=new int[size];
		 int[] arr2=new int[size];
		 int[] sum=new int[size];
		 for(int i=0;i<size;i++) {
			 System.out.println("enter the elements of given size"+i);
			 arr1[i]=scan.nextInt();
		 }
		 for(int i=0;i<size;i++) {
			 System.out.println("enter the elements of given size");
			 arr2[i]=scan.nextInt();
		 }
		 for(int i=0;i<size;i++) {
		 sum[i]=arr1[i]+arr2[i];
	    }
		 for(int i=0;i<size;i++) {
				System.out.print(sum[i]+" ");
		 }	 
			 
	}	
		 
	}

//output
enter the size
3
enter the elements of given size0
1
enter the elements of given size1
2
enter the elements of given size2
3
enter the elements of given size
12
enter the elements of given size
1
enter the elements of given size
3
13 3 6 
	
  


