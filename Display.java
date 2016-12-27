package prapul;

public class Display {
	public static void main(String args[]){
		Triangle triangle = new Triangle();
		triangle.details();
		triangle.findPerimeter();
		triangle.findArea();
		
		Rectangle rect = new Rectangle();
		rect.details();
		rect.findPerimeter();
		rect.findArea();
		
		Circle circle = new Circle();
		circle.details();
		circle.findPerimeter();
		circle.findArea();
	}
}
