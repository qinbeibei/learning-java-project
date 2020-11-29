package net.my.learning.ch7.reusing;

public class Student extends Person {

	public void callSay() {
		super.say();
		System.out.println("student");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.callSay();

	}

}

class TestPerson {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.say();
	}
}

class Person {
	protected void say() {
		System.out.println("Hi");
	}
}
