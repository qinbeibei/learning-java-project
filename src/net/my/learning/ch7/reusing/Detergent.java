package net.my.learning.ch7.reusing;

public class Detergent extends Cleanser {

	public void scrub() {
		append(" Detergent scrub()");
		super.scrub();
	}

	public void foam() {
		append(" foam()");
	}

	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);

	}

}

class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {
		s = s + a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser cs = new Cleanser();
		cs.dilute();
		cs.apply();
		cs.scrub();
		System.out.println(cs);
	}
}