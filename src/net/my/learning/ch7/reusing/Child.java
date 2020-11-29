package net.my.learning.ch7.reusing;

public class Child extends Dad {
	// Cannot override the final method from Dad

	/*
	 * public final void f() {
	 * 
	 * }
	 */

	// 没有覆盖父类的方法，相当于创建一个新的方法，加了@Override就会报错
	private final void g() {
		System.out.println("Child.g()");
	}

	public static void main(String[] args) {
		Child ch = new Child();
		ch.f();
		ch.g();
	}

}

class Dad {
	public final void f() {
		System.out.println("Dad.f()");
	}

	private final void g() {
		System.out.println("Dad.g()");
	}
}

final class FF {

}

//The type HH cannot subclass the final class FF
/*
 * class HH extends FF {
 * 
 * }
 */
