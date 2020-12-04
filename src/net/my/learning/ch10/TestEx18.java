package net.my.learning.ch10;

public class TestEx18 {

	public static class InnerA implements A {
		public InnerA() {
			System.out.println("InnerA()");
		}

		@Override
		public void f() {
			System.out.println("InnerA().f()");
		}
	}

	public static A get() {
		return new InnerA();
	}

	public static void main(String[] args) {
		A a = get();
		a.f();
	}

}

interface A {

	void f();

}
