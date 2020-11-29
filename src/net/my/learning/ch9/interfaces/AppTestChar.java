package net.my.learning.ch9.interfaces;

import java.util.Random;

public class AppTestChar {
	private static Random rand = new Random();

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			char c = (char) rand.nextInt(256);
			System.out.println(c);
		}

	}

}
