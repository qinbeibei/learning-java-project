package net.my.learning.ch9.interfaces.training13;

public class Zoo {

	public static void main(String[] args) {

	}

}

interface Animal {
	public void eat();
}

interface Reptail extends Animal {
	public void creep();
}

interface MarineAnimal extends Animal {
	public void swim();
}

interface Amphibian extends Reptail, MarineAnimal {

}

class Frog implements Amphibian {

	@Override
	public void eat() {

	}

	@Override
	public void swim() {

	}

	@Override
	public void creep() {

	}

}
