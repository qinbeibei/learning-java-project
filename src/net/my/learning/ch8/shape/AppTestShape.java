package net.my.learning.ch8.shape;

public class AppTestShape {

	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] shapes = new Shape[5];
		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = gen.next();
		}
		for (Shape s : shapes) {
			s.erase();
			s.move();
		}

	}

}
