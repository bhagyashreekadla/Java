
import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the yaer number");
		int year=scan.nextInt();
		if (isLeapYear(year)){
			System.out.println("it is leap year");
		}
		else {
			System.out.println("it is not leap year");
		}
	}
	public static boolean isLeapYear(int year)
	{
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) 
				   {
					return true;
				   }
				 else {
					return false;
                  }
				  }
			  else {
					return true;
				   }
			 }    
		      else {
					return false;

//OUTPUT
Enter the yaer number
2002
it is not leap year

            
				   }
	    }
}

