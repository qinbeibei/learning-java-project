package net.my.learning.ch7.reusing;

/**
 * 第7章，练习3
 * 
 * @author qinbe
 *
 */
public class Cartoon3D extends Cartoon {

	public void say() {
		System.out.println("hiiii");
	}

	public static void main(String[] args) {
		Cartoon3D ct3d = new Cartoon3D();
		ct3d.say();
	}

}
