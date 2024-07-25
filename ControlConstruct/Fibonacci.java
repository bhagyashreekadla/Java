import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
	System.out.println("enter the 'n'");
    int n=scan.nextInt();
    int num1=0;
    int num2=1;
    int sum=0;
    if(n==1)
   	 System.out.println(num1);
    else if(n==1 && n==2)
   	 System.out.print(num1 +" "+num2 );
    else
    {
   	 System.out.print(num1 +" "+num2 );
   	 for (int i=3;i<=n;i++)
   	 {
   		 sum=num1+num2;
   		 num1=num2;
   		 num2=sum;
   		 System.out.print(" "+sum) ;
   	 }
    }
	}
}

