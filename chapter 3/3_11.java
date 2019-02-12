/*(Find the number of days in a month) Write a program that prompts the user
to enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012, the program should display
that February 2012 had 29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 had 31 days*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month, year, days;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month eg February = 2: ");
        month = input.nextInt();
        System.out.print("Enter year: ");
        year = input.nextInt();
        
        if (month == 1)
            System.out.println("January " + year + " had 31 days");
        if (month == 2 && (year % 4 != 0))
            System.out.println("February " + year + " had 28 days");
        if (month == 2 && (year % 4 == 0))
            System.out.println("February " + year + " had 29 days");
        if (month == 3)
            System.out.println("March " + year + " had 31 days");
        if (month == 4)
            System.out.println("April " + year + " had 30 days");
        if (month == 5)
            System.out.println("May " + year + " had 31 days");
        if (month == 6)
            System.out.println("June " + year + " had 30 days");
        if (month == 7)
            System.out.println("July " + year + " had 31 days");
        if (month == 8)
            System.out.println("August " + year + " had 31 days");
        if (month == 9)
            System.out.println("September " + year + " had 30 days");
        if (month == 10)
            System.out.println("October " + year + " had 31 days");
        if (month == 11)
            System.out.println("November " + year + " had 30 days");
        if (month == 12)
            System.out.println("December " + year + " had 31 days");
    }
}