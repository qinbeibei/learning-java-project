package net.my.learning.ch9.interfaces.training15;

public class AppAbs {

	public static void main(String[] args) {
		new Tomato().g();

	}

}

abstract class Fruit {
	public abstract void g();
}

abstract class Vegetables {
	public abstract void h();
}

class Tomato extends Fruit {

	@Override
	public void g() {
		System.out.println("g()");
	}

}
