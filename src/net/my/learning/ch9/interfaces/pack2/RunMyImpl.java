package net.my.learning.ch9.interfaces.pack2;

import net.my.learning.ch9.interfaces.pack1.MyInterface;

public class RunMyImpl {

	public static void main(String[] args) {
		run(new MyImpl());
	}

	public static void run(MyInterface my) {
		my.f();
		my.g();
		my.h();
	}

}
