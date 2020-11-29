package net.my.learning.ch8.training16;

public class Starship {
	private AlertStatus status = new NormalStatus();

	public Starship() {
		System.out.println("Starship take off");
	}

	void changeToDanger() {
		status = new UrgencyStatus();
	}

	void changeTourgency() {
		status = new DangerStatus();
	}

	private void recover() {
		status = new NormalStatus();
	}

	public static void main(String[] args) {
		Starship ship = new Starship();
		ship.status.show();
		ship.changeToDanger();
		ship.status.show();
		ship.changeTourgency();
		ship.status.show();
		ship.recover();
		ship.status.show();
	}

}

class AlertStatus {
	public void show() {
		System.out.println("AlertStatus");
	}
}

class UrgencyStatus extends AlertStatus {
	public void show() {
		System.out.println("Urgency");
	}
}

class DangerStatus extends AlertStatus {
	public void show() {
		System.out.println("danger");
	}
}

class NormalStatus extends AlertStatus {
	public void show() {
		System.out.println("normal");
	}
}
