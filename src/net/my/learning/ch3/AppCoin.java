package net.my.learning.ch3;

import static net.my.learning.util.Print.print;

import java.util.Random;

public class AppCoin {
	public static void main(String[] args) {
		print("Test coin:");
		int m = 0, n = 0;
		for (int i = 0; i < 10000; i++) {
			boolean b = Coin.flip();
			print(b);
			if (b) {
				m++;
			} else {
				n++;
			}
		}
		print("m=" + m + ",n=" + n);
	}
}

class Coin {
	static boolean flip() {
		Random rd = new Random();
		int i = rd.nextInt(100);
		print(i);
		if (i < 50) {
			return true;
		}
		return false;
	}
}
