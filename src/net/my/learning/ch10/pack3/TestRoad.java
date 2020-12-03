package net.my.learning.ch10.pack3;

import net.my.learning.ch10.pack2.Transportation;

public class TestRoad {

	protected class Car implements Transportation {

		@Override
		public void run() {
			System.out.println("Car.run()");

		}

	}

	public Transportation getCarFromRoad() {// 返回值向上转型为接口
		return new Car();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
