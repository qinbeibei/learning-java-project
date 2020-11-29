package net.my.learning.ch7.reusing;

public class Bath {
	// 定义字段时进行初始化，在构造器之前执行
	private String s1 = "happy", s2 = "day", s3, s4;
	private Soup sp;
	private int i;
	private float toy;
	private static double d;

	{
		System.out.println("init of i in Bath");
		i = 47;// 非静态实例初始化,在构造器之前执行
	}

	private Water w = new Water();//

	static {
		// 静态初始化，在main之前执行，跟语句的顺序无关，放后面它也是第一个执行
		System.out.println("init of static d in Bath");
		d = 1.11;
	}

	public Bath() {
		System.out.println("Inside Bath()");
		s3 = "Joy";// 构造器里初始化
		toy = 3.14f;
		sp = new Soup();
	}

	public String toString() {
		if (s4 == null) {
			System.out.println("Delayed init");
			s4 = "Hi";
		}

		return "s1=" + s1 + "\n" + "s2=" + s2 + "\n" + "s3=" + s3 + "\n" + "s4=" + s4 + "\n" + "i=" + i + "\n" + "toy="
				+ toy + "\n" + "sp=" + sp + "\n";
	}

	public static void main(String[] args) {
		System.out.println("====main======");
		Bath b = new Bath();
		System.out.println(b);
	}

}

class Soup {
	private String s;
	private int n;
	{
		System.out.println("init of n in Soup");
		n = 99;
	}

	public Soup() {
		System.out.println("Soup()");
		s = "constructed";
	}

	public String toString() {
		return s;
	}
}

class Water {
	public Water() {
		System.out.println("Water()");
	}
}
