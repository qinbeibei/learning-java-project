package net.my.learning.ch10;

import net.my.learning.ch10.Vegetables.Pumpkin;

public class TestEx20 {

	public static void main(String[] args) {
		new Pumpkin().grow();
	}

}

interface Vegetables {
	// 接口中的内部类，自动是public和static的，所以它是一个嵌套类
	public class Pumpkin implements Vegetables {
		public Pumpkin() {
			System.out.println("Pumpkin()");
		}

		@Override
		public void grow() {
			System.out.println("pumpkin is growing");
		}
	}

	public void grow();
}
