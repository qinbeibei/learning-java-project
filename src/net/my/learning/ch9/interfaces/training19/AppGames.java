package net.my.learning.ch9.interfaces.training19;

public class AppGames {
	public static void playGame(GameFactory factory) {
		Game game = factory.getGame();
		game.toss();
	}

	public static void main(String[] args) {
		playGame(new CoinFactory());
		playGame(new DiceFactory());
	}

}

interface Game {
	public void toss();
}

interface GameFactory {
	public Game getGame();
}

class CoinFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new CoinGame();
	}

}

class DiceFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new DiceGame();
	}

}

class CoinGame implements Game {
	CoinGame() {
	}

	@Override
	public void toss() {
		System.out.println("Coin.toss()");

	}

}

class DiceGame implements Game {
	DiceGame() {
	}

	@Override
	public void toss() {
		System.out.println("Dice.toss()");

	}

}
