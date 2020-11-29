package net.my.learning.ch7.reusing;

public class FinalTest {
	private static final int VAL = 99;
	private final String s = "qwerty";// final必须初始化

	private static final T T_STATIC = new T(1);
	private final T t = new T(1);

	private final int j;// 如果在定义时没有初始化、在构造函数里也没有初始化，就会报错
	private final ZXC zxc;

	public FinalTest() {
		j = 0;
		zxc = new ZXC();
	}

	public FinalTest(int j) {
		this.j = j;
		zxc = new ZXC();
	}

	public static void main(String[] args) {
		FinalTest ft1 = new FinalTest();
		FinalTest ft2 = new FinalTest();
		System.out.println(FinalTest.VAL);
		System.out.println(ft1.VAL);
		System.out.println(ft2.VAL);
		// ft1.s = "lalala";//The final field FinalTest.s cannot be assigned

		System.out.println(ft1.s);
		System.out.println(ft2.s);
		// FinalTest.i = 88;//The final field FinalTest.s cannot be assigned

		System.out.println("=========");
		// ft1.t = new T(3);//不能new，引用不能改变
		System.out.println(ft1.t.n);// 1
		System.out.println(ft2.t.n);// 1
		ft1.t.n = 2;// 改变final对象内部成员的值
		System.out.println(ft1.t.n);// 2
		System.out.println(ft2.t.n);// 1

		System.out.println("=========");
		System.out.println(ft1.T_STATIC.n);// 1
		System.out.println(ft2.T_STATIC.n);// 1
		FinalTest.T_STATIC.n = 8;// 改变static final对象内部成员的值,因为static只有一份，所有的都变了
		System.out.println(ft1.T_STATIC.n);// 8
		System.out.println(ft2.T_STATIC.n);// 8

		System.out.println("=========");
		FinalTest ft3 = new FinalTest(66);
		System.out.println("j=" + ft3.j + " zxc=" + ft3.zxc);
		FinalTest ft4 = new FinalTest();
		System.out.println("j=" + ft4.j + " zxc=" + ft4.zxc);
	}

}

class T {
	int n;

	T(int n) {
		this.n = n;
	}

}

class ZXC {
	public String toString() {
		return "ZXCtoString";
	}
}
