package net.my.learning.ch4;

import static net.my.learning.util.Print.print;

public class AppFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fib(10);
	}

	static void Fib(int n) {
		int temp1 = 1, temp2 = 1;
		for (int i = 0; i < n; i++) {
			if (i == 0 || i == 1) {
				print("1");
			} else {
				int temp3 = temp1 + temp2;
				print(temp3);
				temp1 = temp2;
				temp2 = temp3;
			}
		}
		return;
	}
}
