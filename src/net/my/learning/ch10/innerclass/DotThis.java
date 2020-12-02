package net.my.learning.ch10.innerclass;

public class DotThis {

	void f() {
		System.out.println("DotThis.f()");
	}

	public class Inner {
		public DotThis getOuter() {
			return DotThis.this;// 获取外部类的引用
		}
	}

	public Inner getInner() {
		return new Inner();
	}

	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.getInner();
		dti.getOuter().f();
	}

}
