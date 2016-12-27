package prapul;

import java.util.Scanner;

public class Rectangle extends Figure{
	
	double l, b, r_area, r_perimeter;

	@Override
	void details() {
		Scanner rect = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle: ");
		l = rect.nextDouble();
		System.out.println("Enter the breadth of the rectangle: ");
		b = rect.nextDouble();
	}
	@Override
	void findArea() {
		r_area = l * b;
		System.out.println("The area of the rectangle is: " + r_area);
	}
	
	@Override
	void findPerimeter() {	
		r_perimeter = 2*(l + b);
		System.out.println("The perimeter of the rectangle is: " + r_perimeter);
	}
}