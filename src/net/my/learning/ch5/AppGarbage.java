package net.my.learning.ch5;

public class AppGarbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookNew book = new BookNew();
		book.show();
		// book.finalize();
		System.gc();
	}

}

class BookNew {
	String names = "default";

	void show() {
		System.out.println(this.names);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize is called");
	}
}