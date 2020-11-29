package net.my.learning.ch8.training1and17;

public class AppTestCycle {

	static void play(Cycle cycle) {
		cycle.ride();
	}

	static void play2(Cycle cycle) {
		cycle.ride2();
	}

	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();

		play(u);
		play(b);
		play(t);

		play2(u);
		play2(b);
		play2(t);
	}

}
