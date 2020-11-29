package net.my.learning.ch6.access;

import net.my.learning.ch6.access.dessert.Cookie;

/**
 * 示例：子类可以访问父类的哪些方法 ，ChocolateChip和Cookie不在同一个包里
 * 
 * @author qinbe
 *
 */
public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}

	public void chomp() {
		System.out.println("ChocolateChip chomp!");
		// bite();// 不可以访问父类的包权限的方法，如果不在同一个包里
		// fun_private();//不可以访问私有方法
		fun();
		bite2();// 可以访问父类的protected方法

	}

	public static void main(String[] args) {
		ChocolateChip c = new ChocolateChip();
		c.chomp();
	}

}
