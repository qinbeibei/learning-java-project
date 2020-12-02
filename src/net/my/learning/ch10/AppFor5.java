package net.my.learning.ch10;

import net.my.learning.ch10.School.Teacher;

public class AppFor5 {

	public static void main(String[] args) {
		School school = new School("zzz");
		// Teacher t = new Teacher();报错
		Teacher t = school.new Teacher();
	}

}
