/*
(Geometry: area of a pentagon) The area of a pentagon can be computed using the
following formula:
					Area = (5 * s^2) / 4 * tan(PI / 5 )
Write a method that returns the area of a pentagon using the following header:
public static double area(double side)
Write a main method that prompts the user to enter the side of a pentagon and
displays its area.
*/
import java.util.Scanner;

public class Exercise_06_35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		System.out.println("The area of the pentagon is " + area(side));
	}

	public static double area(double side) {
		return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
	}
}