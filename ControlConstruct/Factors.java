import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		printFactors(number);
	}
	public static void printFactors(int num) {
		System.out.print("Factors of " + num + " are: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) 
				System.out.print(i + " ");
         }
	}	
}

//OUTPUT
Enter a number: 5
Factors of 5 are: 1 5 

