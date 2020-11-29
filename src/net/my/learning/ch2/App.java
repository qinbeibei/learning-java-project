package net.my.learning.ch2;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello,world");

		ATypeName a = new ATypeName();
		System.out.println("a.i=" + a.i);
		System.out.println("a.c=" + a.c);
		System.out.println("a.d=" + a.d);

		DataOnly data = new DataOnly();
		data.i = 100;
		data.b = true;
		data.d = 12.34;
		System.out.println("data.i=" + data.i + ",data.b=" + data.b + ",data.d=" + data.d);

		String s = "qwerty12345";
		System.out.println("storage=" + StrUtil.storage(s));

		System.out.println("init value of StaticTest.i=" + StaticTest.i);
		Incrementable.increment();
		System.out.println("after increment, value of StaticTest.i=" + StaticTest.i);

		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println("st1.i=" + st1.i);
		System.out.println("st2.i=" + st2.i);
		return;
	}

}

class ATypeName {
	int i;
	char c;
	double d;
}

class DataOnly {
	int i;
	double d;
	boolean b;
}

class StrUtil {
	static int storage(String s) {
		return s.length() * 2;
	}
}

class StaticTest {
	static int i = 47;
}

class Incrementable {
	static void increment() {
		StaticTest.i++;
	}
}
