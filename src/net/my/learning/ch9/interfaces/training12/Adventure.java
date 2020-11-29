package net.my.learning.ch9.interfaces.training12;

public class Adventure {
	public static void f(CanFight c) {
		c.fight();
	}

	public static void g(CanSwim s) {
		s.swim();
	}

	public static void h(CanFly x) {
		x.fly();
	}

	public static void v(ActionCharacter a) {
		a.fight();
	}

	public static void t(CanClimb c) {
		c.climb();
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		f(hero);
		g(hero);
		h(hero);
		v(hero);
		t(hero);
	}

}

interface CanFight {
	public void fight();
}

interface CanSwim {
	public void swim();
}

interface CanFly {
	public void fly();
}

interface CanClimb {
	public void climb();
}

class ActionCharacter {
	public void fight() {
		System.out.println("ActionCharacter.fight()");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {

	@Override
	public void fly() {
		System.out.println("Hero.fly()");
	}

	@Override
	public void swim() {
		System.out.println("Hero.swim()");
	}

	@Override
	public void climb() {
		System.out.println("Hero.climb()");
	}

}