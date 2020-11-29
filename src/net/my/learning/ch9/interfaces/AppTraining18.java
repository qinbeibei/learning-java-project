package net.my.learning.ch9.interfaces;

public class AppTraining18 {

	public static void rideCycle(CycleFactory cf) {
		Cycle cycle = cf.getCycle();
		cycle.ride();
	}

	public static void main(String[] args) {
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new TricycleFactory());
	}

}

interface Cycle {
	public void ride();
}

interface CycleFactory {
	public Cycle getCycle();
}

class Unicycle implements Cycle {
	Unicycle() {
	}

	@Override
	public void ride() {
		System.out.println("Unicycle.ride()");

	}

}

class UnicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}

}

class Bicycle implements Cycle {
	Bicycle() {
	}

	@Override
	public void ride() {
		System.out.println("Bicycle.ride()");
	}

}

class BicycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Bicycle();
	}

}

class Tricycle implements Cycle {
	Tricycle() {
	}

	@Override
	public void ride() {
		System.out.println("Tricycle.ride()");
	}

}

class TricycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Tricycle();
	}

}
