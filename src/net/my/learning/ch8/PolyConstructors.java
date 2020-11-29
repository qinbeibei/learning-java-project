package net.my.learning.ch8;

class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}

	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;

	RoundGlyph(int r) {
		System.out.println("RoundGlyph(),radius=" + radius);
		radius = r;
		System.out.println("RoundGlyph(),radius=" + radius);
	}

	void draw() {
		System.out.println("RoundGlyph.draw(),radius=" + radius);
	}
}

class RectangularGlyph extends Glyph {
	private int len = 2;

	RectangularGlyph(int len) {
		System.out.println("RectangularGlyph(),len=" + this.len);
		this.len = len;
		System.out.println("RectangularGlyph(),len=" + this.len);
	}

	void draw() {
		System.out.println("RectangularGlyph.draw(),len=" + this.len);
	}
}

public class PolyConstructors {

	public static void main(String[] args) {
		new RoundGlyph(5);
		System.out.println();
		new RectangularGlyph(8);

	}

}
