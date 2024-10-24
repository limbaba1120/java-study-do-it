package org.java.masteringjava.ch03.ch03;

public class GenericMethod {

	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {

		double left = ((Number)p1.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();

		double width = right - left;
		double height = bottom - top;

		return width * height / 2;
	}

	public static void main(String[] args) {

		Point<Integer, Double> point1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> point2 = new Point<Integer, Double>(10, 10.0);

		double result = GenericMethod.makeRectangle(point1, point2);

		System.out.println(result);
	}
}
