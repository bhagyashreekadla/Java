import java.util.Scanner;
public class PerfectSquare {
	public static boolean isPerSqu(int num) {
		int sqrt = (int) Math.sqrt(num);
		return sqrt * sqrt == num; 
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number= scanner.nextInt();
		boolean isPerSqu = isPerSqu(number);
		if (isPerSqu) 
			System.out.println(" is a perfect square.");
		 else 
			System.out.println(" is not a perfect square.");
	}
	}

//OUTPUT
Enter a number: 25
 is a perfect square.



