/*(Algebra: solve quadratic equations) The two roots of a quadratic equation
ax2 + bx + c = 0 can be obtained using the following formula:
r1 = -b + 2b2 - 4ac
2a
and r2 = -b - 2b2 - 4ac
2a
b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”.
Note that you can use Math.pow(x, 0.5) to compute 2x. Here are some
sample runs.*/
import java.util.Scanner;
public class Main {
	public static void main(String[] args);{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a, b, с : ");
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	double discriminant = Math.pow(b, 2) - 4 * a *c;

	double root1 = (- b + (Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)))/2 * a;
	double root2 = (- b - (Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)))/2 * a;

	if (discriminant >= 0)

		System.out.println("The equation has 2 roots " + root1 + "and"
			+ root2);
	else if (discriminant == 0)
		System.out.println("The equation has one root " + root1 );
	else 
		System.out.println("The equation has no real roots ");
}
}