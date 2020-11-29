package net.my.learning.ch6.access.dessert;

/*
 * 示例：protected方法和字段具有包访问权限，Cookie和Breakfast在同一个包里
 */
public class Breakfast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cookie x = new Cookie();
		Cookie x2 = new Cookie("a");
		x.bite();
		x2.bite();

		x.bite2();// protected方法具有包访问权限
		x2.bite2();
		System.out.println(x.b);// 同一个包里，protected权限的成员可以访问
		System.out.println(x2.i);// 包访问权限
	}

}
