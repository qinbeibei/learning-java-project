package net.my.learning.ch9.interfaces;

/**
 * 一个class里如有一个abstract方法，这个class一定要声明成abstract。一个abstract class不一定要有abstract方法
 * 
 * @author qinbe
 *
 */
public class AppTraining2 {

	public static void main(String[] args) {
		// NoMethod nm = new NoMethod();//Cannot instantiate the type NoMethod

		// 下面花括号里的东西是自动生成的
		HaveMethod hm = new HaveMethod() {

			@Override
			public void f() {
				// TODO Auto-generated method stub

			}
		};
		hm.g();

		MyClass mc = new MyClass() {
		};
		mc.h();
	}

}

abstract class NoMethod {

}

abstract class HaveMethod {
	public abstract void f();

	public void g() {
		System.out.println("HaveMethod.g()");
	}
}

abstract class MyClass {
	public void h() {
		System.out.println("MyClass.h()");
	}
}
