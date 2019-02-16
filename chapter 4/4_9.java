/*
(Find the Unicode of a character) Write a program that receives a character and
displays its Unicode.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);

		System.out.println((int)ch);
	}
}