/*(Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display the future day of the week. Here is a sample run:*/
import java.util.Scanner;
public class Main {

    public static void main(String[] agrs) {
    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter a year: ");
    	int day = input.nextInt();

    	System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();

        int futureDay = (day + elapsedDays) % 7;
        String day_of_week = "";

    	switch (day) {
            case 0: day_of_week = "Sunday"; break;
            case 1: day_of_week = "Monday"; break;
            case 2: day_of_week = "Tuesday"; break;
            case 3: day_of_week = "Wednesday"; break;
            case 4: day_of_week = "Thursday"; break;
            case 5: day_of_week = "Friday"; break;
            case 6: day_of_week = "Saturday";
        }

        switch (futureDay) {
            case 0:
                System.out.println("Today is " + day_of_week + " and the future day is Sunday."); break;
            case 1:
                System.out.println("Today is " + day_of_week + " and the future day is Monday."); break;
            case 2:
                System.out.println("Today is " + day_of_week + " and the future day is Tuesday."); break;
            case 3:
                System.out.println("Today is " + day_of_week + " and the future day is Wednesday."); break;
            case 4:
                System.out.println("Today is " + day_of_week + " and the future day is Thursday."); break;
            case 5:
                System.out.println("Today is " + day_of_week + " and the future day is Friday."); break;
            case 6:
                System.out.println("Today is " + day_of_week + " and the future day is Saturday.");
        }
    }
}