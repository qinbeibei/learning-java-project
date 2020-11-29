package net.my.learning.ch7.reusing;

public class Chess extends BoardGame {

	Chess() {
		super(11);// 这句必须写在第一行不然会报错
		// TODO Auto-generated constructor stub
		System.out.println("Chess cons");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess x = new Chess();
	}

}

class Game {
	Game(int i) {
		System.out.println("Game cons");
	}
}

class BoardGame extends Game {

	BoardGame(int i) {// 编译器提示自动生成构造函数
		super(i);
		// TODO Auto-generated constructor stub
		System.out.println("BoardGame cons");
	}

}