package net.my.learning.ch9.interfaces;

/**
 * 练习9，10
 * 
 * @author qinbe
 *
 */
abstract class Rodent {
	private Head h0 = new Head();

	public Rodent() {
		System.out.println("==Rodent()==");
	}

	public abstract void eat();

	public void f1() {
		System.out.println("Rodent.f1()");
		f2();
	}

	public abstract void f2();
}

class Mouse extends Rodent {
	private Tail tail = new Tail();

	public Mouse() {
		System.out.println("Mouse()");
	}

	@Override
	public void eat() {
		System.out.println("Mouse is eating!");
	}

	@Override
	public void f2() {
		System.out.println("Mouse.f2()");
	}
}

class Gerbil extends Rodent {
	public Gerbil() {
		System.out.println("Gerbil()");
	}

	@Override
	public void eat() {
		System.out.println("Gerbil is eating!");
	}

	@Override
	public void f2() {
		System.out.println("Gerbil.f2()");
	}
}

public class RunRodent {

	public static void main(String[] args) {
		Rodent[] rs = new Rodent[] { new Mouse(), new Gerbil() };
		System.out.println();
		for (Rodent r : rs) {
			r.eat();
		}

		System.out.println();
		Rodent rodent = new Mouse();
		rodent.f1();

		Gerbil gerbil = new Gerbil();
		gerbil.f1();
	}

}

class Head {
	public Head() {
		System.out.println("Head()");
	}
}

class Tail {
	public Tail() {
		System.out.println("Tail()");
	}
}
