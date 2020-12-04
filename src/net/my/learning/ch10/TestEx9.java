package net.my.learning.ch10;

public class TestEx9 {

	public static void main(String[] args) {
		Animal animal = new TestEx9().getAnimal();
		animal.eat();
		animal.sleep();
	}

	public Animal getAnimal() {
		class Duck implements Animal {

			@Override
			public void eat() {
				System.out.println("Duck is eating");
			}

			@Override
			public void sleep() {
				System.out.println("Duck is sleeping");
			}

		}

		return new Duck();
	}

}
