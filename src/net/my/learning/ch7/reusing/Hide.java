package net.my.learning.ch7.reusing;

/**
 * 练习13
 * 
 * @author qinbe
 *
 */
public class Hide extends Homer {
	// 重载
	String doh(String s) {
		System.out.println("Hide.doh(String)");
		return "s";
	}

	// 覆盖
	@Override
	float doh(float f) {
		System.out.println("Hide.doh(float)");
		return f + 1;
	}

	public static void main(String[] args) {
		Hide hide = new Hide();
		hide.doh(true);
		hide.doh('c');
		hide.doh(2);
		hide.doh(1.0f);
		hide.doh("");
	}

}

class Homer {
	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}

	float doh(float f) {
		System.out.println("doh(float)");
		return 1.0f;
	}

	boolean doh(boolean b) {
		System.out.println("doh(boolean)");
		return false;
	}
}
