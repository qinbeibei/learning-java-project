package net.my.learning.ch7.reusing;

public class Earth extends Planet {

	Earth(int i) {
		super(i);
		System.err.println("Earth cons");
	}

	public static void main(String[] args) {
		Earth e = new Earth(0);
	}

}

class Planet {
	private Air a;
	private Soil s;
	{
		a = new Air(0);
		s = new Soil(0);
	}

	Planet(int i) {
		System.err.println("Planet cons");
	}
}

class Air {
	Air(int i) {
		System.err.println("Air cons");
	}
}

class Soil {
	Soil(int i) {
		System.err.println("Soil cons");
	}
}