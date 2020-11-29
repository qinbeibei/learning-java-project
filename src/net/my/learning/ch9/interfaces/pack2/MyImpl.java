package net.my.learning.ch9.interfaces.pack2;

import net.my.learning.ch9.interfaces.pack1.MyInterface;

public class MyImpl implements MyInterface {

	@Override
	public void f() {
		System.out.println("MyImpl.f()");
	}

	@Override
	public void g() {
		System.out.println("MyImpl.g()");
	}

	@Override
	public void h() {
		System.out.println("MyImpl.h()");
	}

}
