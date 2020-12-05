package net.my.learning.ch10;

public class TestEx26 {

	public static void main(String[] args) {
		OuterQ oq = new OuterQ(1);
		R r = new R(oq);

	}

}

class OuterQ {
	OuterQ(int i) {
		System.out.println("Q() i=" + i);
	}

	class InnerQ {

	}
}

class R extends OuterQ.InnerQ {
	R(OuterQ q) {
		q.super();
		System.out.println("R()");
	}
}
