package net.my.learning.ch10;

public class TestEx10 {

	public static void main(String[] args) {
		Animal animal = new TestEx10().getAnimal(true, "haha");
		if (animal != null) {
			animal.eat();
			animal.sleep();
		}

	}

	public Animal getAnimal(Boolean b, String name) {
		if (b) {
			class Pig implements Animal {

				private String name;

				Pig(String name) {
					this.name = name;
				}

				@Override
				public void eat() {
					System.out.println("Pig " + name + " is eating");
				}

				@Override
				public void sleep() {
					System.out.println("Pig " + name + " is sleeping");
				}

			}
			return new Pig(name);
		}

		return null;
	}

}
