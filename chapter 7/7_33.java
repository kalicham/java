/*
(Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store the animal names.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		String[] zodiacs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger",
									"rabbit", "dragon", "snake", "horse", "sheep"};

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		System.out.println("You are : " + zodiacs[year % 12]);
	}
}