package net.my.learning.ch10.pack1;

import net.my.learning.ch10.Outer;

public class AppOuter2 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		// Inner inner = outer.getInner();//Inner是包访问权限
		outer.f();

		Outer outer2 = new Outer();
		// Outer.Inner inner2 = outer2.getInner();

	}

}
