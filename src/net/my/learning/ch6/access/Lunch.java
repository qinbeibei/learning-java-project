package net.my.learning.ch6.access;

public class Lunch {
	void testPrivate() {
		// Soup1 soup = new Soup1();
		// Soup2 sp2 = new Soup2();
	}

	void testStatic() {
		Soup1 soup1 = Soup1.makeSoup();
		Soup2 soup2 = Soup2.access();
		soup2.f();
	}
}

class Soup1 {
	private Soup1() {

	}

	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2 {
	private Soup2() {

	}

	private static Soup2 sp = new Soup2();// 单例模式

	public static Soup2 access() {
		return sp;
	}

	public void f() {
		System.out.println("Soup2 f()");
	}
}