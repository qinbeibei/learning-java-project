package net.my.learning.ch4;

import static net.my.learning.util.Print.print;

import java.util.Random;

public class AppRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int arr[] = new int[25];
		String s = "", bigger_s = "", smaller_s = "", equals_s = "";
		for (int i = 0; i < 25; i++) {
			arr[i] = rd.nextInt(100);
			s += (arr[i] + ",");
		}

		print(s);
		for (int i = 0; i < 24; i++) {

			if (arr[i] > arr[i + 1]) {
				bigger_s = bigger_s + arr[i] + ",";
			} else if (arr[i] < arr[i + 1]) {
				smaller_s = smaller_s + arr[i] + ",";
			} else {
				equals_s = equals_s + arr[i] + ",";
			}

		}
		print("bigger:" + bigger_s);
		print("smaller:" + smaller_s);
		print("equals:" + equals_s);
	}

}
