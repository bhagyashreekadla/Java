import java.util.*;
public class DiagonalElements {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the row");
		int row=scan.nextInt();
		System.out.println("enter the size of the column");
		int col=scan.nextInt();
		int[] [] age=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			       System.out.println("enter the values of the row: "+ i + " col:" +j);
			        age[i][j]=scan.nextInt();
		}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j) 
					System.out.print(age[i][j]+" ");
				else {
					System.out.print(" ");
				}     
			}
			System.out.println();
		
		}
	}
}

//OUTPUT
enter the size of the row
3
enter the size of the column
3
enter the values of the row: 0 col:0
1
enter the values of the row: 0 col:1
2
enter the values of the row: 0 col:2
3
enter the values of the row: 1 col:0
4
enter the values of the row: 1 col:1
5
enter the values of the row: 1 col:2
6
enter the values of the row: 2 col:0
7
enter the values of the row: 2 col:1
8
enter the values of the row: 2 col:2
9
1   
  5  
    9 




