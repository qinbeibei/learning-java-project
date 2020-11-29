package net.my.learning.ch7.reusing;

/**
 * 第7章，练习8
 * 
 * @author qinbe
 *
 */
public class Fruit extends Food {

	Fruit(float w) {
		super(w);
		System.out.println("Fruit:w=" + w);
	}

	Fruit() {
		super(0);// 没有这句就报错，有这句就不报错
		System.out.println("Fruit default cons");
	}

	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		Fruit f2 = new Fruit(0.99f);
	}

}

class Food {
	/*
	 * Food() { System.out.println("Food default cons"); }
	 */

	Food(float w) {
		System.out.println("Food:w=" + w);
	}
}
