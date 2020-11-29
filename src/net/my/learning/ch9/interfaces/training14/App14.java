package net.my.learning.ch9.interfaces.training14;

public class App14 {
	public static void f1(Writer w) {

	}

	public static void f2(Reader r) {

	}

	public static void f3(Teacher t) {

	}

	public static void f4(Professor p) {

	}

	public static void main(String[] args) {
		Jim j = new Jim();
		f1(j);
		f2(j);
	}

}

interface Writer {
	public void write();
}

interface Reader {
	public void reader();

}

interface Teacher {
	public void teach();
}

interface Professor extends Writer, Reader, Teacher {
	public void research();
}

class Person {
	public void sleep() {
		System.out.println("Person.sleep()");
	}
}

class Jim extends Person implements Professor {

	@Override
	public void write() {

	}

	@Override
	public void reader() {

	}

	@Override
	public void teach() {

	}

	@Override
	public void research() {

	}

}
