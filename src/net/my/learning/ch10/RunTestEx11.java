package net.my.learning.ch10;

public class RunTestEx11 {

	public static void main(String[] args) {
		Animal animal = new TestEx11().getAnimal();
		animal.eat();
		animal.sleep();

		// Fox fox = (Fox) new TestEx11().getAnimal();报错
		// fox.eat();
		// fox.sleep();

	}

}
