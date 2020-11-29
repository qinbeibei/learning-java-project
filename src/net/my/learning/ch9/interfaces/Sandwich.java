package net.my.learning.ch9.interfaces;

interface FastFood {
	public void mix();
}

class Bread {
	Bread() {
		System.out.println("Bread()");
	}
}

class Chess {
	Chess() {
		System.out.println("Chess()");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Pickle {
	Pickle() {
		System.out.println("Pickle()");
	}
}

public class Sandwich implements FastFood {
	private Bread bread = new Bread();
	private Chess chess = new Chess();
	private Lettuce lettuce = new Lettuce();
	private static Pickle pickle = new Pickle();
	private Pickle pickle2 = new Pickle();

	public Sandwich() {
		System.out.println("Sandwich()");
	}

	public static void main(String[] args) {
		new Sandwich().mix();

	}

	@Override
	public void mix() {
		System.out.println("sandwich.mix()");

	}

}
