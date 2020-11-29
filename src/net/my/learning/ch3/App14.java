package net.my.learning.ch3;

import static net.my.learning.util.Print.print;

public class App14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compare('a', 'a');
		compare('a', 'z');

	}

	static void compare(char c1, char c2) {
		print("c1:" + c1 + ",c2:" + c2);
		print("c1 == c2:" + (c1 == c2));// true
		print("c1 != c2:" + (c1 != c2));// false
		print("c1 equals c2:" + (new Character(c1).equals(new Character(c2))));// true

		print("c1 > c2:" + (c1 > c2));
		print("c1 < c2:" + (c1 < c2));
		print("===end===");
		// return false;
	}

}
