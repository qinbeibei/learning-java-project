package net.my.learning.ch10;

//练习12
public class Room2 {

	private String name = "default";
	private int age = 0;

	private void clean() {
		System.out.println("name=" + name + ",age=" + age + " room.clean()");
	}

	public Robot1 getARobotAndDoWork() {
		return new Robot1() {
			private double height;

			public String toString() {
				return "height=" + height;
			}

			private void change(String s) {
				name = s;
				Room2.this.age = 9;
			}

			private void doClean() {
				clean();
			}

			public void doWork() {
				change("haha");
				doClean();
			}
		};
	}

	public static void main(String[] args) {
		Room2 room = new Room2();
		Robot1 robot = room.getARobotAndDoWork();
		robot.doWork();

	}

}

class Robot1 {
	public void doWork() {

	}
}
