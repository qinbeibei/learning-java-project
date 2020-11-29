package net.my.learning.ch9.interfaces.music5;

/**
 * 同时使用继承和implement
 * 
 * @author qinbe
 *
 */
interface Instrument {
	int VALUE = 5;// static & final

	public void adjust();
}

interface Playable {
	public void play(Note n);
}

abstract class CommonInst implements Instrument, Playable {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}
}

class Wind extends CommonInst {
	public String toString() {
		return "Wind";
	}
}

class Stringed extends CommonInst {
	public String toString() {
		return "Stringed";
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class WoodWind extends Wind {
	public String toString() {
		return "WoodWind";
	}
}

public class Music5 {
	public static void tune(Playable i) {
		i.play(Note.MIDDLE_C);
	}

	public static void tuneAll(Playable[] e) {
		for (Playable i : e) {
			tune(i);
		}
	}

	public static void main(String[] args) {
		Playable[] orchestra = { new Wind(), new Stringed(), new Brass(), new WoodWind() };
		tuneAll(orchestra);
	}

}
