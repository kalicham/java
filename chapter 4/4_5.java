/*
(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
which all sides are of the same length and all angles have the same degree (i.e., the
polygon is both equilateral and equiangular). The formula for computing the area
of a regular polygon is
Here, s is the length of a side. Write a program that prompts the user to enter the
number of sides and their length of a regular polygon and displays its area.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of sides: ");
		int numberOfSides = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();

		double area = (numberOfSides * Math.pow(side, 2) / 
			(4 * Math.tan(Math.PI / numberOfSides)));

		System.out.println("The area of the polygon is " + area);
	}
}