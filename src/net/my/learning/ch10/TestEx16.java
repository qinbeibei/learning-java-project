package net.my.learning.ch10;

public class TestEx16 {

	public static void rideCycle(CycleFactory cf) {
		Cycle cycle = cf.getCycle();
		cycle.ride();
	}

	public static void main(String[] args) {
		rideCycle(Unicycle.factory);
		rideCycle(Bicycle.factory);
		rideCycle(Tricycle.factory);
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

	public static CycleFactory factory = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Unicycle();
		}
	};

}

class Bicycle implements Cycle {
	Bicycle() {
	}

	@Override
	public void ride() {
		System.out.println("Bicycle.ride()");
	}

	public static CycleFactory factory = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Bicycle();
		}
	};

}

class Tricycle implements Cycle {
	Tricycle() {
	}

	@Override
	public void ride() {
		System.out.println("Tricycle.ride()");
	}

	public static CycleFactory factory = new CycleFactory() {
		@Override
		public Cycle getCycle() {
			return new Tricycle();
		}
	};

}

class TricycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Tricycle();
	}

}
