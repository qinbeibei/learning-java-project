package net.my.learning.ch2;

public class AppWrapperType {

	/*
	 * Java SE5的自动包装功能，自动将基本类型转换为包装器类型，并可以反向转换
	 */
	public static void main(String[] args) {
		System.out.println("Hello,World");

		char c0 = 'c';
		Character c1 = 'd';
		Character c2 = c0;
		Character c3 = new Character('x');
		char cc0 = c3;
		System.out.println(c0 + "," + c1 + "," + c2 + "," + c3 + "," + cc0);

		int i = 100;
		Integer j = 200;
		Integer k = i;
		Integer m = new Integer(300);
		System.out.println(i + "," + j + "," + k + "," + m);

		boolean b = true;
		boolean b0 = new Boolean(false);
		Boolean b1 = b;
		Boolean b2 = false;
		Boolean b3 = new Boolean(b);
		Boolean b4 = new Boolean(false);
		System.out.println(b + "," + b0 + "," + b1 + "," + b2 + "," + b3 + "," + b4);
	}

}
