package net.my.learning.ch10;

import net.my.learning.ch10.Outer.Inner;

public class AppOuter {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.getInner();
		outer.f();

		Outer outer2 = new Outer();
		Outer.Inner inner2 = outer2.getInner();
	}

	public void g() {
		Outer outer = new Outer();
		Inner inner = outer.getInner();
	}

}
