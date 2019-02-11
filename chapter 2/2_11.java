import java.util.Scanner;
public class Main {

    public static void main(String[] agrs) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter the number of the year: ");
    	int year = input.nextInt();

        int birth = 365 * 24 * 60 * 60 / 7 * year;
        int death = 365 * 24 * 60 * 60 / 13 * year;
        int migrant = 365 * 24 * 60 * 60 / 45 * year;

        int population = 312032486 + birth + death + migrant;

        System.out.println("Population in " + year + " years is " 
        	+ population );


    }

}