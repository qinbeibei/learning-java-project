package net.my.learning.ch3;

import static net.my.learning.util.Print.print;

public class AppHexAndPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long a = 0x1234ABCDL;
		Long b = 01234567L;
		print(Long.toBinaryString(a));
		print(Long.toBinaryString(b));

		float fmax = Float.MAX_VALUE;
		float fmin = Float.MIN_VALUE;
		print(fmin + "," + fmax);
		double dmin = Double.MIN_VALUE;
		double dmax = Double.MAX_VALUE;
		print(dmin + "," + dmax);

	}

}
