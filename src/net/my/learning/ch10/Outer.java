package net.my.learning.ch10;

public class Outer {

	class Inner {
		Inner() {
			System.out.println("Inner()");
		}
	}

	public Inner getInner() {
		return new Inner();
	}

	public void f() {
		Outer outer = new Outer();
		Inner inner = outer.getInner();
		Outer outer2 = new Outer();
		Outer.Inner inner2 = outer2.getInner();

		Inner in2 = new Inner();// 在非静态方法里可以new
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.getInner();// 两种写法

		Outer outer2 = new Outer();
		Outer.Inner inner2 = outer2.getInner();// 两种写法

		Outer outer3 = new Outer();
		// Inner inner3 = new Inner();//No enclosing instance of type Outer is
		// accessible 在静态方法里不能直接new出来

	}

}
