package net.my.learning.ch7.reusing;

public class Beetle extends Insect {

	private int k = printInit("Beetle.k init");

	public Beetle() {
		System.out.println("k=" + k);
		System.out.println("j=" + j);
	}

	private static int x2 = printInit("static Beetle.x2 init");

	public static void main(String[] args) {
		// 什么都不写，运行结果是
		// static Insect.x1 init
		// static Beetle.x2 init

		System.out.println("=====Beetle.main()=====");

		Beetle bt1 = new Beetle();
		System.out.println("==========");
		Beetle bt2 = new Beetle();// static初始化只会执行一次

		// int j = Beetle.x2;// 对static成员的访问也会加载类

	}

}

class Insect {
	private int i = 9;
	protected int j;

	Insect() {
		System.out.println("i=" + i + ", j=" + j);
		j = 39;
	}

	private static int x1 = printInit("static Insect.x1 init");

	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}