package net.my.learning.ch9.interfaces;

public class AppTraining3 {

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.print();

	}

}

abstract class RootClass {
	public abstract void print();

	public RootClass() {
		System.out.println("RootClass() cons");
		print();
	}
}

class ChildClass extends RootClass {
	private int i = 99;

	public ChildClass() {
		System.out.println("ChildClass() cons");
	}

	@Override
	public void print() {
		System.out.println("i=" + this.i);
	}

}
