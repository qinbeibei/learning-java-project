package net.my.learning.ch5;

import static net.my.learning.util.Print.print;

public class AppExplicitStatic {

	static Cups cups1 = new Cups();
	static Cups cups2 = new Cups();
	// 加了这两句之后输出
	/*
	 * Cup(1) Cup(2) Cups() Cups() main() f(99)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("main()");
		Cups.cup1.f(99);
		// 输出:
		// main()
		// Cup(1)
		// Cup(2)
		// f(99)

	}

}

class Cup {
	Cup(int marker) {
		print("Cup(" + marker + ")");
	}

	void f(int marker) {
		print("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}

	Cups() {
		print("Cups()");
	}
}