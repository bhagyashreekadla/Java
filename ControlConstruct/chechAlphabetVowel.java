import java.util.Scanner;
public class chechAlphabetVowel {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
	System.out.println("enter the character");
	String al=scan.nextLine();
	if(al=="a"||al=="e"||al=="i"||al=="o"|al=="u")
		System.out.println("alphabet is vowel");
	else
		System.out.println("aplhabet is consoent");

//OUTPUT
enter the character
a
aplhabet is consoent
