import java.util.Scanner;
public class countdigits {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the  number");
		int num =scan.nextInt();
		int digcou=count(num);
		System.out.println("digitcount: "+digcou);		
}
	public static int count(int num) {
		int count=0;
		while(num!=0) {
		num=num/10;
		count++;
		}
		return count;
	}
}

//OUTPUT
1256
digitcount: 4
