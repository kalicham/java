/*********************************************************************************
* (Geometry: the MyRectangle2D class) Define the MyRectangle2D class that        *
* contains:                                                                      *
*                                                                                *
* ■ Two double data fields named x and y that specify the center of the          *
*   rectangle with getter and setter methods. (Assume that the rectangle sides   *
*   are parallel to x- or y- axes.)                                              *
* ■ The data fields width and height with getter and setter methods.             *
* ■ A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) *
*   and 1 for both width and height.                                             *
* ■ A constructor that creates a rectangle with the specified x, y, width, and   *
*   height.                                                                      *
* ■ A method getArea() that returns the area of the rectangle.                   *
* ■ A method getPerimeter() that returns the perimeter of the rectangle.         *
* ■ A method contains(double x, double y) that returns true if the specified     *
*   point (x, y) is inside this rectangle (see Figure 10.24a).                   *
* ■ A method contains(MyRectangle2D r) that returns true if the specified        *
*   rectangle is inside this rectangle (see Figure 10.24b).                      *
* ■ A method overlaps(MyRectangle2D r) that returns true if the specified        *
*   rectangle overlaps with this rectangle (see Figure 10.24c).                  *
*                                                                                *
* Draw the UML diagram for the class and then implement the class. Write a test  *
* program that creates a MyRectangle2D object r1 (new MyRectangle2D(2, 2, 5.5,   *
*  4.9)), displays its area and perimeter, and displays the result of            *
* r1.contains(3, 3), r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)), and        *
* r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).                                *
*********************************************************************************/
public class Main {
	public static void main(String[] args) {
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		System.out.println("\nRectangle:");
		System.out.println("Area: " + r1.getArea());
		System.out.println("Perimeter: " + r1.getPerimeter());
		System.out.println((r1.contains(3, 3) ? "Contains" : "Does not contain") + 
			" the point (3, 3).");
		System.out.println(
			(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)) ? "Contains" : 
				"Does not contain") + " the rectangle with points (4, 5, 10.5, 3.2)");
		System.out.println(
			(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)) ? "Overlaps" : 
			"Does not overlap") + " the rectangle with points (3, 5, 2.3, 5.4)");
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