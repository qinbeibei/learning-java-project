package net.my.learning.ch7.reusing;

/**
 * 3层继承关系
 * 
 * @author qinbe
 *
 */
public class Cartoon extends Drawing {

	Cartoon() {
		System.out.println("Cartoon constructor");
	}

	public static void main(String[] args) {
		Cartoon ct = new Cartoon();

	}

}

class Art {
	Art() {
		System.out.println("Art constructor");// 基类构造器总是会被调用，且在导出类构造器之前被调用
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}
}
