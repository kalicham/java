/*********************************************************************************
* (Geometry: the bounding rectangle) A bounding rectangle is the minimum         *
* rectangle that encloses a set of points in a two-dimensional plane, as shown   *
* in Figure 10.24d. Write a method that returns a bounding rectangle for a set   *
* of points in a two-dimensional plane, as follows:                              *
*                                                                                *
* public static MyRectangle2D getRectangle(double[][] points)                    *
*                                                                                *
* The Rectangle2D class is defined in Programming Exercise 10.13. Write a test   *
* program that prompts the user to enter five points and displays the bounding   *
* rectangle’s center, width, and height.                                         *
*********************************************************************************/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] points = new double[5][2];

		System.out.print("\nEnter five points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		MyRectangle2D r1 = MyRectangle2D.getRectangle(points);

		System.out.println("The bounding rectangle's center (" + r1.getX() + ", " + 
			r1.getY() + "), width " + r1.getWidth() + ", height " + r1.getHeight());
	}
	public class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;

	MyRectangle2D() {
		this(0, 0, 1, 1);
	}

	MyRectangle2D(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}


	public static MyRectangle2D getRectangle(double[][] points) {
		final int COLUMN_X = 0;
		final int COLUMN_Y = 1;
		double[] minMaxX = minMax(points, COLUMN_X);
		double[] minMaxY = minMax(points, COLUMN_Y);
		double x = (minMaxX[1] + minMaxX[0]) / 2;
		double y = (minMaxY[1] + minMaxY[0]) / 2;
		double height = Math.sqrt(Math.pow(minMaxY[1] - minMaxY[0], 2));;
		double width = Math.sqrt(Math.pow(minMaxX[1] - minMaxX[0], 2));
		return new MyRectangle2D(x, y, width, height);
	}

	private static double[] minMax(double[][] points, int col) {
		double[] minMax = new double[2];
		minMax[0] = minMax[1] = points[0][col];
		for (int i = 0; i < points.length; i++) {
			if (points[i][col] < minMax[0])
				minMax[0] = points[i][col];
			if (points[i][col] > minMax[1])
				minMax[0] = points[i][col];
		}
		return minMax;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.x = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	public boolean contains(double x, double y) {
		return getDistance(this.y, y) <= height / 2 && 
				 getDistance(this.x, x) <= width / 2; 
	}

	public boolean contains(MyRectangle2D r) {
		return 
			getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 && 
		 	getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 &&
			height / 2 + r.getHeight() / 2 <= height &&
		 	width / 2 + r.getWidth() / 2 <= width;
	}

	public boolean overlaps(MyRectangle2D r) {
		return !contains(r) &&
				 ((x + width / 2 > r.getX() - r.getWidth()) ||
				 (y + height / 2 > r.getY() - r.getHeight())) &&
		  		 (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) && 
				 (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
	}

	private double getDistance(double p1, double p2) {
		return Math.sqrt(Math.pow(p2 - p1, 2));
	}
}
}