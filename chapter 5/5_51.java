/*
(Longest common prefix) Write a program that prompts the user to enter two
strings and displays the largest common prefix of the two strings.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String string1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String string2 = input.nextLine();

		int index = 0;				
		String prefix = "";		

		while (string1.charAt(index) == string2.charAt(index)) {
			prefix += string1.charAt(index);
			index++;
		}

		if (prefix.length() > 0)
			System.out.println("The commmon prefix is " + prefix);
		else
			System.out.println(string1 + " and " + string2 +
				" have no commmon prefix");
	}
}