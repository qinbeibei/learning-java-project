package net.my.learning.ch10;

public class TestEx15 {

	public static void main(String[] args) {
		Kid kid = new Kid("Lily");
		Fruit f = kid.pick();
		f.print();
	}

}

class Fruit {
	protected int number;

	public Fruit(int n) {
		number = n;
	}

	public void print() {

	}
}

class Kid {
	private String name;

	public Kid(String name) {
		this.name = name;
	}

	public Fruit pick() {
		return new Fruit(10) {
			public void print() {
				System.out.println(name + " pick " + super.number + " Apples");
			}
		};
	}
}
