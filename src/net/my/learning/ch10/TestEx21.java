package net.my.learning.ch10;

import net.my.learning.ch10.FastFood.Bag;

public class TestEx21 {

	public static void main(String[] args) {
		Bag.call(new Hamburger());
	}

}

interface FastFood {

	public class Bag {
		public static void call(FastFood fastfood) {
			fastfood.f();
		}
	}

	public void f();
}

class Hamburger implements FastFood {

	@Override
	public void f() {
		System.out.println("hamburger.f()");
	}

}
