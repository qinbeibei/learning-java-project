package net.my.learning.ch7.reusing;

/**
 * 第7章，练习1
 * 
 * @author qinbe
 *
 */
public class Desk {

	private Cup cup;

	public Desk() {
		System.out.println("Desk()");
	}

	public String toString() {
		if (cup == null) {
			cup = new Cup();
		}
		return "cup=" + cup;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desk d = new Desk();
		System.out.println(d);
	}

}

class Cup {
	public Cup() {
		System.out.println("Cup()");
	}

	public String toString() {
		return "a cup";
	}
}
