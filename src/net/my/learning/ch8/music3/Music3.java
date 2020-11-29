package net.my.learning.ch8.music3;

class Instrument {
	void play(Note n) {
		System.out.println("Instrument.play() " + n);
	}

	public String toString() {
		return "Instrument";
	}

	void adjust() {
		System.out.println("adjusting Instrument");
	}
}

class Wind extends Instrument {
	void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	void adjust() {
		System.out.println("adjusting Wind");
	}
}

class Stringed extends Instrument {
	void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	void adjust() {
		System.out.println("adjusting Stringed");
	}
}

class Brass extends Wind {
	void play(Note n) {
		System.out.println("Brass.play() " + n);
	}

	void adjust() {
		System.out.println("adjusting Brass");
	}
}

class WoodWind extends Wind {
	void play(Note n) {
		System.out.println("WoodWind.play() " + n);
	}

	public String toString() {
		return "WoodWind";
	}
}

public class Music3 {
	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Instrument[] e) {
		for (Instrument i : e) {
			tune(i);
		}
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind(), new Stringed(), new Brass(), new WoodWind() };
		tuneAll(orchestra);

		for (Instrument i : orchestra) {
			System.out.println(i);
		}
	}

}
