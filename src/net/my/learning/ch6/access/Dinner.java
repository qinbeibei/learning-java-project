package net.my.learning.ch6.access;

import net.my.learning.ch6.access.dessert.Cookie;

/*
 * 示例
 * Dinner和Cookie不在同一个包里，Dinner可以访问Cookie的public方法和字段，其他的都不行
 */
public class Dinner {
	public static void main(String[] args) {
		System.out.println("Dinner main");
		Cookie x = new Cookie();
		x.fun();// public方法
		System.out.println(x.s);// public字段
		System.out.println(x.getP());

		// Cookie x2 = new Cookie("a");
		// x.bite();
		// x.bite2();
		// x.p;

		// x.b;
		// x.i;

	}
}
