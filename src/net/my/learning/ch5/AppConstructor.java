package net.my.learning.ch5;

import static net.my.learning.util.Print.print;

public class AppConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		print(data.s);

		Data2 d2 = new Data2("world");
		print(d2.r);
		print(d2.t);

		Book book1 = new Book();
		Book book2 = new Book("java");
		book1.read();
		book2.read();

		DogTest dog = new DogTest();
		dog.bark();
		dog.bark("wangwang");
		dog.bark(0);
		dog.bark(1, "");
		dog.bark("", 1);

		Mouse m = new Mouse();
		print(m.i);

		////////
		Person p = new Person("abc");
		p.fun1();

		Person p2 = new Person("dfg", 12);
		p2.show();
	}

}

class Data {
	String s;
}

class Data2 {
	String r = "hello";
	String t;

	Data2(String t) {
		this.t = t;
	}
}

class Book {
	String name;

	Book() {
		System.out.println("book default constructor!");
	}

	Book(String name) {
		this.name = name;
		System.out.println("args=" + name);
	}

	void read() {
		System.out.println("reading a book:" + this.name);
	}
}

class DogTest {
	String names;

	public void bark(String says) {
		System.out.println(says);
	}

	public void bark() {
		System.out.println("barking");
	}

	public void bark(int temp) {
		System.out.println("howling");
	}

	public void bark(int i, String s) {
		System.out.println("baaaaarking");
	}

	public void bark(String s, int i) {
		System.out.println("barkingggg");
	}
}

class Mouse {// 没有自定义构造器
	int i = 47;
}

class Person {
	String name;
	int age;

	Person(String name) {
		this.name = name;
	}

	Person(String name, int age) {
		this(name);// 在一个构造器中调用另一个构造器
		this.age = age;
	}

	void show() {
		System.out.println(this.name + " is " + this.age);
	}

	void fun1() {
		fun2();
		this.fun2();// use this to call
	}

	void fun2() {
		System.out.println("it's fun2");
	}
}