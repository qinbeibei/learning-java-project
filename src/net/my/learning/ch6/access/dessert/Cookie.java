package net.my.learning.ch6.access.dessert;

public class Cookie {
	public String s = "public sss";
	private String p = "private ppp";
	int i = 99;
	protected boolean b;

	public Cookie() {
		System.out.println("cookie constructor");
	}

	// 什么都不写就是包权限
	Cookie(String s) {
		System.out.println("cookie constructor 2");
	}

	public void fun() {
		System.out.println("cookie public fun!");
	}

	void bite() {
		System.out.println("cookie bite!");
	}

	protected void bite2() {
		System.out.println("cookie bite2!");
	}

	private void fun_private() {
		System.out.println("cookie fun_private");
	}

	public void call_fun_pri() {
		fun_private();
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}
}
