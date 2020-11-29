package net.my.learning.ch4;

import static net.my.learning.util.Print.print;

public class AppForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("test for loop");
		for (int i = 1; i <= 100; i++) {
			print(i);
			if (i == 99) {
				break;
			}
		}
		////////////
		print("test while loop");
		int j = 1;
		while (j <= 100) {
			print(j);
			if (j == 99) {
				return;
			}
			j++;
		}
		//////////
		print("test do-while loop");
		int k = 1;
		do {
			print(k);
			k++;
		} while (k <= 100);
	}

}
