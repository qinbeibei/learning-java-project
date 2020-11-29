package net.my.learning.ch4;

import static net.my.learning.util.Print.print;

public class AppIfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(test(1, 0, 10));
		print(test(20, 0, 10));
	}

	static boolean test(int testval, int begin, int end) {
		if (testval >= begin && testval <= end) {
			return true;
		}
		return false;
	}

}
