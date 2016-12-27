package prapul;

import java.util.Scanner;

public class Circle extends Figure{
	
	final double pie = 3.142;
	double r, c_area, c_perimeter;
	
	@Override
	void details() {
		Scanner circle = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		r = circle.nextDouble();
	}

	@Override
	void findArea() {
		c_area = pie*r*r;
		System.out.println("The area of the circle is :" + c_area);
	}

	@Override
	void findPerimeter() {
		c_perimeter = 2*pie*r;
		System.out.println("The perimeter of the circle is: " + c_perimeter);
	}
}
