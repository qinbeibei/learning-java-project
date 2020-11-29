package net.my.learning.ch3;

import static net.my.learning.util.Print.print;

public class AppDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		dog1.names = "spot";
		dog1.says = "Ruff!";
		dog1.show();

		Dog dog2 = new Dog();
		dog2.names = "scruffy";
		dog2.says = "Wurf!";
		dog2.show();

		Dog dog3 = dog1;

		print(dog1 == dog2);
		print(dog1 == dog3);
		print(dog1.equals(dog2));
		print(dog1.equals(dog3));
	}

}

class Dog {
	String names;
	String says;

	void show() {
		print(names + " " + says);
	}
}
