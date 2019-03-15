/*********************************************************************************
* (The Rectangle class) Following the example of the Circle class in Section 9.2,*
* design a class named Rectangle to represent a rectangle. The class contains:   *
*                                                                                *
* ■ Two double data fields named width and height that specify the width and     *
* height of the rectangle. The default values are 1 for both width and height.   *
* ■ A no-arg constructor that creates a default rectangle.                       *
* ■ A constructor that creates a rectangle with the specified width and height.  *
* ■ A method named getArea() that returns the area of this rectangle.            *
* ■ A method named getPerimeter() that returns the perimeter.                    *
*                                                                                *
* Draw the UML diagram for the class and then implement the class. Write a test  *
* program that creates two Rectangle objects—one with width 4 and height 40      *
* and the other with width 3.5 and height 35.9. Display the width, height, area, *
* and perimeter of each rectangle in this order.                                 *
*********************************************************************************/
public class Main {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4, 40);

		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		System.out.println("\n Rectangle 1");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle1.width);
		System.out.println("Height:    " + rectangle1.height);
		System.out.println("Area:      " + rectangle1.getArea());
		System.out.println("Perimeter: " + rectangle1.getPerimeter());

		System.out.println("\n Rectangle 2");
		System.out.println("-------------");
		System.out.println("Width:     " + rectangle2.width);
		System.out.println("Height:    " + rectangle2.height);
		System.out.println("Area:      " + rectangle2.getArea());
		System.out.println("Perimeter: " + rectangle2.getPerimeter());
	}
	            //UML Class Diagram                     
/**************************************************
*               Rectangle                         *  
* ------------------------------------------------*  
* width: double                                   *
* height: double                                  * 
* Rectangle()                                     *  
* Rectangle(newWidth: double, newHeight: double)  *
* getArea(): double                               *
* getPerimeter(): double                          *
***************************************************/

public class Rectangle {
	double width;	// Width
	double height;	// Height 

	Rectangle() {
		width = 1;
		height = 1;
	} 
 
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	double getArea() {
		return width * height; 
	}

	double getPerimeter() {
		return 2 * (width + height);
	}
}
}