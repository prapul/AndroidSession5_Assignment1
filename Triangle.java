package prapul;

import java.util.Scanner;

public class Triangle extends Figure{
	
	double a, b, c, s, t_area, t_perimeter;

	@Override
	void details() {
		Scanner triangle = new Scanner(System.in);
		System.out.println("Enter the first side of the triangle: ");
		a = triangle.nextDouble();
		System.out.println("Enter the second side of the triangle: ");
		b = triangle.nextDouble();
		System.out.println("Enter the third side of the triangle: ");
		c = triangle.nextDouble();
		s = (a+b+c)/2;
	}
	
	@Override
	void findArea() {
		t_area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of the triangle is: " + t_area);
	}

	@Override
	void findPerimeter() {
		t_perimeter = a + b + c;
		System.out.println("The perimeter of the triangle is: " + t_perimeter);
	}
}
