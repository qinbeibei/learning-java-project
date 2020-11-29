package net.my.learning.ch8.training1and17;

public class AppRunCycle {

	public static void main(String[] args) {
		Cycle[] cycles = new Cycle[] { new Unicycle(), new Bicycle(), new Tricycle() };
		((Unicycle) cycles[0]).balance();
		((Bicycle) cycles[1]).balance();
		((Unicycle) cycles[2]).balance();// Tricycle cannot be cast to net.my.learning.ch8.training1and17.Unicycle
	}

}
