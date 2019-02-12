/*(Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
that “The equation has no solution.”
*/
import java.util.Scanner;
public class Main {

    public static void main(String[] agrs) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter a,b,c,d,e,f: ");
    	double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double temp = a * d - b * c;
        double x = (e*d-b*f) / temp;
        double y = (a*f-e*c)/temp;

        if (temp == 0)
        	System.out.println("The equation has no solution.");
        else 
            System.out.println("x is " + x + " y is " + y);


    }

}