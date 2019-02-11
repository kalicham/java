import java.util.Scanner;
public class Main {

    public static void main(String[] agrs) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter the temperature in Fahrenheit between -58 and 41: ");
    	double t = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double v = input.nextDouble();

        double result = 35.74 + 0.6215 * t - 35.75 * Math.pow(v,0.16) + 0.4275 * t * Math.pow(v,0.16);

        System.out.println("The wind chill index is "
         + result );


    }

}