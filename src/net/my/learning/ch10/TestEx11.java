package net.my.learning.ch10;

public class TestEx11 {

	public static void main(String[] args) {
		Animal animal = new TestEx11().getAnimal();
		animal.eat();
		animal.sleep();

		Fox fox = (Fox) new TestEx11().getAnimal();
		fox.eat();
		fox.sleep();
	}

	private class Fox implements Animal {

		@Override
		public void eat() {
			System.out.println("Fox is eating");
		}

		@Override
		public void sleep() {
			System.out.println("Fox is sleeping");
		}

	}

	public Animal getAnimal() {
		return new Fox();// 向上转型
	}

}
