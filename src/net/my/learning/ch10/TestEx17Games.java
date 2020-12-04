package net.my.learning.ch10;

public class TestEx17Games {
	public static void playGame(GameFactory factory) {
		Game game = factory.getGame();
		game.toss();
	}

	public static void main(String[] args) {
		playGame(CoinGame.factory);
		playGame(DiceGame.factory);
	}

}

interface Game {
	public void toss();
}

interface GameFactory {
	public Game getGame();
}

class CoinGame implements Game {
	CoinGame() {
	}

	@Override
	public void toss() {
		System.out.println("Coin.toss()");

	}

	public static GameFactory factory = new GameFactory() {
		@Override
		public Game getGame() {
			return new CoinGame();
		}
	};

}

class DiceGame implements Game {
	DiceGame() {
	}

	@Override
	public void toss() {
		System.out.println("Dice.toss()");

	}

	public static GameFactory factory = new GameFactory() {
		@Override
		public Game getGame() {
			return new DiceGame();
		}
	};

}
