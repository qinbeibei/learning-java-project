package net.my.learning.ch7.reusing;

/**
 * 练习11，代理
 * 
 * @author qinbe
 *
 */
public class Detergent2 {

	private Cleanser2 cleanser = new Cleanser2();

	public void scrub() {
		cleanser.scrub();
	}

	public void dilute() {
		cleanser.dilute();
	}

	public void apply() {
		cleanser.apply();
	}

	public String toString() {
		return cleanser.toString();
	}

	public static void main(String[] args) {
		Detergent2 x = new Detergent2();
		x.scrub();
		x.dilute();
		x.apply();
		System.out.println(x);
	}

}

class Cleanser2 {
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