package net.my.learning.ch7.reusing;

public class C extends A {
	C(int i) {
		super(i);
		// TODO Auto-generated constructor stub
		b = new B(i);
	}

	private B b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C x = new C(47);
		System.out.println(x.getB());
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

}

class A {
	A(int i) {
		System.out.println("AAAA:i=" + i);
	}
}

class B {
	B(int i) {
		System.out.println("BBBB:i=" + i);
	}

	public String toString() {
		return "";
	}
}
