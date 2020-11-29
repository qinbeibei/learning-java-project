package net.my.learning.ch8.music3;

import java.util.Random;

public class Music4 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e) {
			tune(i);
		}
	}

	private static void printAll(Instrument[] e) {
		for (Instrument i : e) {
			System.out.println(i);
		}
	}

	private static InstrumentGen gen = new InstrumentGen();

	public static void main(String[] args) {
		Instrument[] orchestra = new Instrument[5];
		for (int k = 0; k < orchestra.length; k++) {
			orchestra[k] = gen.next();
		}

		tuneAll(orchestra);
		System.out.println("================");
		printAll(orchestra);
	}

}

class InstrumentGen {
	private Random rand = new Random();

	public Instrument next() {
		int n = rand.nextInt(4);
		System.out.println("rand=" + n);
		switch (n) {
		default:
		case 0:
			return new Wind();
		case 1:
			return new Stringed();
		case 2:
			return new Brass();
		case 3:
			return new WoodWind();

		}
	}

}
