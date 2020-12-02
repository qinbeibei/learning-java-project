package net.my.learning.ch10;

//练习3
public class Outer2 {
	private String ss;

	public Outer2(String s) {
		System.out.println("Outer2()");
		ss = s;
	}

	class Inner {
		Inner() {
			System.out.println("Inner()");
		}

		public String toString() {
			return ss;
		}
	}

	public Inner getInner() {
		return new Inner();
	}

	public static void main(String[] args) {
		Outer2 outer = new Outer2("hello");
		Inner inner = outer.getInner();// 两种写法
		System.out.println(inner.toString());

	}

}
