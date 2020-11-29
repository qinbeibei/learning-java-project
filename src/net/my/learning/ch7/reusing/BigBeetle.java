package net.my.learning.ch7.reusing;

public class BigBeetle extends Beetle {
	private String name;
	{
		System.out.println("BigBeetle init");
		name = "lalala";
	}

	BigBeetle() {
		System.out.println("BigBeetle cons");
	}

	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		System.out.println("===========main()==========");
		BigBeetle b = new BigBeetle();
		System.out.println("===============");
		System.out.println(b);
	}
}
