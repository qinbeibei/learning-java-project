package net.my.learning.ch7.reusing;

public class Stem extends Root {
	private Component1 c1;
	private Component2 c2;
	private Component3 c3;
	{
		System.out.println("Stem init");
		c1 = new Component1();
		c2 = new Component2();
		c3 = new Component3();
	}

	Stem() {
		System.out.println("Stem cons");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stem s = new Stem();
	}

}

class Root {
	private Component1 c1;
	private Component2 c2;
	private Component3 c3;
	{
		System.out.println("Root init");
		c1 = new Component1();
		c2 = new Component2();
		c3 = new Component3();
	}

	Root() {
		System.out.println("Root cons");
	}
}

class Component1 {
	Component1() {
		System.out.println("C1 cons");
	}
}

class Component2 {
	Component2() {
		System.out.println("C2 cons");
	}
}

class Component3 {
	Component3() {
		System.out.println("C3 cons");
	}
}