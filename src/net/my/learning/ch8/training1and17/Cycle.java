package net.my.learning.ch8.training1and17;

public class Cycle {
	public void ride() {
		System.out.println("Cycle.ride()");
	}

	public void ride2() {
		System.out.println("Cycle.ride2(),call wheels()=" + wheels());
	}

	public int wheels() {
		return 0;
	}
}

class Unicycle extends Cycle {
	@Override
	public void ride() {
		System.out.println("Unicycle.ride()");
	}

	@Override
	public int wheels() {
		return 1;
	}

	void balance() {
		System.out.println("Unicycle.balance()");
	}
}

class Bicycle extends Cycle {
	public void ride() {
		System.out.println("Bicycle.ride()");
	}

	public int wheels() {
		return 2;
	}

	void balance() {
		System.out.println("Bicycle.balance()");
	}
}

class Tricycle extends Cycle {
	public void ride() {
		System.out.println("Tricycle.ride()");
	}

	public int wheels() {
		return 3;
	}
}