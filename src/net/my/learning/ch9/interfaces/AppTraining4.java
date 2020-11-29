package net.my.learning.ch9.interfaces;

public class AppTraining4 {

	public static void call(Tree tree) {
		System.out.println("call()");
		((PineTree) tree).f();
		tree.f();// 直接调用，不需要向下转型
	}

	public static void main(String[] args) {
		call(new PineTree());
	}

}

abstract class Tree {
	public abstract void f();
}

class PineTree extends Tree {
	@Override
	public void f() {
		System.out.println("PineTree.f()");
	}
}
