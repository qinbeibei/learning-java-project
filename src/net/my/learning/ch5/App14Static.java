package net.my.learning.ch5;

public class App14Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat.show();
		// 输出
		// static init
		// test,grey
		Cat cat1 = new Cat();// 静态初始化不会执行第二次
		cat1.hello();
		Cat cat2 = new Cat();// 非静态初始化会执行多次
		cat2.hello();
		// non-static init
		// hello,Lucy
		// non-static init
		// hello,Lucy
	}

}

class Cat {
	static String type = "test";
	static String color;
	static {
		System.out.println("static init");
		color = "grey";
	}

	String name;
	{
		System.out.println("non-static init");
		name = "Lucy";

	}

	static void show() {
		System.out.println(type + "," + color);
	}

	void hello() {
		System.out.println("hello," + name);
	}
}