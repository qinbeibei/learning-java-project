package net.my.learning.ch10;

public class TestEx13 {

	public static void main(String[] args) {
		Animal animal = new TestEx13().getAnimal();
		animal.eat();
		animal.sleep();
	}

	public Animal getAnimal() {

		return new Animal() {

			@Override
			public void eat() {
				System.out.println("Duck is eating");

			}

			@Override
			public void sleep() {
				System.out.println("Duck is sleeping");

			}

		};
	}

}
