package net.my.learning.ch7.reusing;

/**
 * 练习16,17
 * 
 * @author qinbe
 *
 */
public class Frog extends Amphibian {

	protected static void say(Amphibian a) {
		System.out.println("frog say()");
	}

	public static void main(String[] args) {
		Amphibian a = new Amphibian();
		Frog frog = new Frog();
		Amphibian.say(a);
		Amphibian.say(frog);
		Frog.say(a);
		Frog.say(frog);
	}

}

class Amphibian {
	protected static void say(Amphibian a) {
		System.out.println("amp say()");
	}
}
