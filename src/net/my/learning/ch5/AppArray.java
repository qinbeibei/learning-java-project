package net.my.learning.ch5;

import static net.my.learning.util.Print.print;

import java.util.Arrays;

public class AppArray {

	public static void main(String[] args) {
		// 数组的3种初始化方式
		String[] s1 = new String[10];
		for (int i = 0; i < 10; i++) {
			s1[i] = "a" + i;
		}
		print(Arrays.toString(s1));

		String[] s2 = { "a", "b" };
		print(Arrays.toString(s2));

		String[] s3 = new String[] { "cd", "yui" };
		for (String temp : s3) {
			print(temp);
		}

		//////////
		print("=============");
		Apple[] apples_empty = new Apple[1];
		Apple[] apples = new Apple[] { new Apple("nnn"), new Apple("ccc") };
		for (Apple a : apples) {
			print(a.type);
		}
	}

}

class Apple {
	String type;

	Apple(String t) {
		print("arg of Apple() is: " + t);
		type = t;
	}
}
