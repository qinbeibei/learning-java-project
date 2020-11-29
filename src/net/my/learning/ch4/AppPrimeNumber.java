package net.my.learning.ch4;

import static net.my.learning.util.Print.print;

public class AppPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 200;
		for (int i = 2; i <= N; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {// 不是质数
					flag = false;
					break;
				}
			}
			if (flag) {
				print(i);
			}
		}
	}

}
