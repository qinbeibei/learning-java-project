package net.my.learning.ch10;

public class TestEx23 {

	public static void main(String[] args) {

		BB bb = new BB(5);
		for (int i = 0; i < 5; i++) {
			AA aa = new AA(i);
			bb.add(aa.getU());
		}

		bb.call();

	}

}

interface U {
	public void f1();

	public void f2();

	public void f3();
}

class AA {
	private int n;

	public AA(int m) {
		n = m;
	}

	public U getU() {
		return new U() {

			@Override
			public void f1() {
				System.out.println("f1() " + n);
			}

			@Override
			public void f2() {
				System.out.println("f2() " + n);
			}

			@Override
			public void f3() {
				System.out.println("f3() " + n);
			}

		};
	}
}

class BB {
	private U[] ulist;
	private int i = 0;

	public BB(int size) {
		if (size < 0) {
			size = 0;
		}
		ulist = new U[size];
	}

	public void add(U u) {
		if (ulist == null || ulist.length == 0)
			return;
		ulist[i] = u;
		i++;
	}

	public void reset() {
		for (U u : ulist) {
			u = null;
		}
	}

	public void call() {
		for (U u : ulist) {
			u.f1();
			u.f2();
			u.f3();
		}
	}
}