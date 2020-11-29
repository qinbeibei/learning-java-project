package net.my.learning.ch4;

import static net.my.learning.util.Print.print;

public class AppSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[] = { 0, 1, 2, 3, 4, 5 };
		for (int i : temp) {
			switch (i) {
			case 0: {
				print("it's 0");
				break;
			}
			case 1: {
				print("it's 1");
				break;
			}
			default: {
				print("default:" + i);
				break;
			}

			}
			print("------");
		}
		print("============");
		for (int i : temp) {
			switch (i) {
			case 0: {
				print("it's 0");
				// break;
			}
			case 1: {
				print("it's 1");
				// break;
			}
			default: {
				print("default:" + i);
				// break;
			}
			}
			print("------");
		}

	}

}
