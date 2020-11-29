package net.my.learning.ch5;

import static net.my.learning.util.Print.print;

import java.util.Arrays;

public class AppVariableArgs {

	/**
	 * 例子：可变参数列表
	 * 
	 * @param args
	 */
	public static void main(String... args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.f("a", "b", "c", "d");
		student.f(new String[] { "e", "f", "g" });

		print("args of main:" + Arrays.toString(args));
	}

}

class Student {
	void f(String... s) {
		print(Arrays.toString(s));
	}
}