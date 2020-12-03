package net.my.learning.ch10.pack4;

import net.my.learning.ch10.pack2.Transportation;
import net.my.learning.ch10.pack3.TestRoad;

//练习6
public class TestHighWay extends TestRoad {
	public Transportation getCar() {// 这里无法直接new Car(),因为Car是包访问权限
		return getCarFromRoad();
	}

	public static void main(String[] args) {
		TestHighWay thw = new TestHighWay();
		Transportation trans = thw.getCar();
		trans.run();

	}

}
