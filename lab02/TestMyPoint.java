package lab02;

public class TestMyPoint {

	public static void main(String[] args) {
		MyPoint a = new MyPoint();
		MyPoint b = new MyPoint(5.5,7);

		System.out.println("The x value for point a is " + a.returnX());
		System.out.println("The y value for point a is " + a.returnY());
		System.out.println("The x value for point b is " + b.returnX());
		System.out.println("The y value for point b is " + b.returnY());
		System.out.println("The distance between point a and point b is " + a.distance(b));
		System.out.println("The distance between point a and point (8.7, 6.8) is " + a.distance(8.7, 6.8));
	}

}
