package net.my.learning.ch10;

import net.my.learning.ch10.School.Teacher;

public class AppFor5 {

	public static void main(String[] args) {
		School school = new School("zzz");
		// Teacher t = new Teacher();直接new报错
		Teacher t = school.new Teacher();
	}

	public void f() {
		// Teacher t = new Teacher();直接new报错
	}

}
