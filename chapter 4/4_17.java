/*
(Days of a month) Write a program that prompts the user to enter a year and the
first three letters of a month name (with the first letter in uppercase) and displays
the number of days in the month.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String month = input.next();

		boolean leapYear = 
			((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

		System.out.print(month + " " + year + " has ");
		
		if ( month == "Jan" || month == "Mar" || 
			  month == "May" || month == "Jul" ||
			  month == "Aug" || month == "Oct" ||
			  month == "Dec")
			System.out.println(31 + " days");
		else if (month == "Apr" || month == "Jun" || 
			month == "Sep" || month == "Nov")
			System.out.println(30 + " days");
		else
			System.out.println(((leapYear) ? 29 : 28) + " days");	
	}
}