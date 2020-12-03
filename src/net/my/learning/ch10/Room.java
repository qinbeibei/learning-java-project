package net.my.learning.ch10;

//练习7，练习8
public class Room {

	private String name = "default";
	private int age = 0;

	private void clean() {
		System.out.println("name=" + name + ",age=" + age + " room.clean()");
	}

	class Robot {
		private double height;

		public String toString() {
			return "height=" + height;
		}

		public void change(String s) {
			name = s;
			Room.this.age = 9;
		}

		public void doClean() {
			clean();
		}
	}

	public void getARobotAndDoWork() {
		Robot r = new Robot();
		r.change("haha");
		r.doClean();
	}

	public void f() {
		// System.out.println("height=" + height);报错
		Robot r = new Robot();
		System.out.println("robot.height=" + r.height);
	}

	public static void main(String[] args) {
		Room room = new Room();
		room.getARobotAndDoWork();
		room.f();
	}

}
