package lab01;

public class TestRectangle {

	public static void main(String[] args) {
		rectangle a = new rectangle();
		rectangle b = new rectangle(5.5,4);
		System.out.println("The height and width of triangle a is: " + a.height + " and " + a.width);
		System.out.println("The area and perimeter of triangle a is: " + 	a.getArea() + " and " + a.getPerimeter());
		System.out.println("The height and width of triangle b is: " + b.height + ", " + b.width);
		System.out.println("The area and perimeter of triangle b is: " + 	b.getArea() + " and " + b.getPerimeter());
	}
}
