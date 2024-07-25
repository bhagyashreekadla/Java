package kodnest;
import java.util.Scanner;
public class patterns{
	public static void main(String[] args) {	
		 for(int i=1;i<=3;i++) {
			 for( int j=5;j>=(2*i-1);j--){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 System.out.println("----------------------------------------------");
		 for(int i=1;i<=3;i++) {
			 for( int j=1;j<=(2*i-1);j++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 System.out.println("----------------------------------------------");
		 for(int i=1;i<=4;i++) {
			 for( int j=1;j<=2*i;j++){
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 System.out.println("----------------------------------------------");
		 for(int i=1;i<=4;i++) {
			 for( int j=1;j<=i;j++){
				 System.out.print(i);
			 }
			 for( int j=1;j<=i;j++){
				 System.out.print("*");
			}
			 System.out.println();
		 }
		 System.out.println("----------------------------------------------");
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=5;j++) {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
		 System.out.println("----------------------------------------------");
		 for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++) {
					System.out.print("-");
				}
				for(int k=5;k>=i;k--) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("___________________________________________");
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=6-i;j++) {
					System.out.print("-");
				}
				for(int k=1;k<=6-i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("___________________________________________");
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++) {
					System.out.print("-");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("___________________________________________");
    for(int i=1;i<=5;i++)
			{
				for(int j=5;j>=i;j--) {
					System.out.print("*");
				}
				System.out.println();
		}
			System.out.println("___________________________________________");
			for(int i=1;i<=5;i++)
			{
				for(int j=5;j>=i;j--) {
					System.out.print("-");
				}
				for(int k=1;k<=i;k++) {
					System.out.print(" * ");
				}
				System.out.println();
			}
			System.out.println("___________________________________________");

			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++) 
				{
					if(i==1 || i==5 ||j==1||j==5) 
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}	
				}
				System.out.println();
		    }
				System.out.println("___________________________________________");
				

//OUTPUT:
*****
***
*
----------------------------------------------
*
***
*****
----------------------------------------------
**
****
******
********
----------------------------------------------
1*
22**
333***
4444****
----------------------------------------------
12345
12345
12345
12345
12345
----------------------------------------------
-*****
--****
---***
----**
-----*
___________________________________________
-----*****
----****
---***
--**
-*
___________________________________________
-*
--**
---***
----****
-----*****
___________________________________________
*****
****
***
**
*
___________________________________________
----- * 
---- *  * 
--- *  *  * 
-- *  *  *  * 
- *  *  *  *  * 
___________________________________________
*****
*   *
*   *
*   *
*****
___________________________________________














  
