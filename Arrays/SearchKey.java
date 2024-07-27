package oops;
import java.util.*;
public class SearchKey {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size");
		 int size=scan.nextInt();
		 char arr[]=new char[size];
		 scan.nextLine();
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("enter the elements of given size");
			 arr[i]=scan.nextLine().charAt(0);
		 }
			 System.out.println("enter the key");
			 char key=scan.nextLine().charAt(0);
			 for(int i=0;i<arr.length;i++) {
				 if(arr[i]==key){
					 System.out.println("key found");
					 return;
				 }
			 }
				 System.out.println("not found");
		 }	 
	}
	
  


