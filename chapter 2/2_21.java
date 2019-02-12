import java.util.Scanner;
public class Main {

    public static void main(String[] agrs) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter inverstment amount: ");
    	double amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterest = input.nextDouble();
        System.out.print("Enter number of year: ")
        double numberOfYear = input.nextDouble();
        double result = amount + (amount * (annualInterest / 100 
        * numberOfYear));

        System.out.println("Accumulated value is $" + result);


    }

}