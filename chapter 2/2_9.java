import java.util.Scanner;
public class Main {

    public static void main(String[] agrs) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter v0, v1 and t: ");
    	double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double a = (v1 - v0) / t;

        System.out.println("Average is " + a );


    }

}