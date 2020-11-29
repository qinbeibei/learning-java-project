package net.my.learning.ch7.reusing;

/**
 * 练习14
 * 
 * @author qinbe
 *
 */
public class Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door(), right = new Door();

	public Car() {
		for (int i = 0; i < 4; i++) {
			wheel[i] = new Wheel();
		}
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.engine.service();
	}

}

class Engine {
	public void start() {

	}

	public void rev() {

	}

	public void stop() {

	}

	public void service() {
		System.out.println("engine service()");
	}

}

class Wheel {
	public void inflate(int psi) {

	}
}

class Door {
	public Window window = new Window();

	public void open() {

	}

	public void close() {

	}
}

class Window {
	public void rollup() {

	}

	public void rolldown() {

	}
}
