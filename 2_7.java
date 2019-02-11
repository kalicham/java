/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
*/
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of minutes: ");
		int minutes = input.nextInt();
		int days = minutes % 525600 % 1440;
		int years = minutes / 525600;
		System.out.println(minutes + " minutes is approximately " + years
		 + " years and " + days + "days");
	}
}
