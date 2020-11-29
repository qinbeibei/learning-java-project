package net.my.learning.ch9.interfaces;

import java.util.Random;

public class AppTraining17 {
	public static void main(String[] args) {
		System.out.println(XYZ.A);
		System.out.println(XYZ.B);
		System.out.println(XYZ.C);
		System.out.println(XYZ.F);

		// new XYZ();//Cannot instantiate the type XYZ
		// XYZ.A = 2;//The final field XYZ.A cannot be assigned

	}
}

interface XYZ {
	int A = 1;
	String B = "QWERTY";

	Random R = new Random();
	int C = R.nextInt();
	float F = R.nextFloat() * 10;
}
