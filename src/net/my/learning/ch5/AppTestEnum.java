package net.my.learning.ch5;

import static net.my.learning.util.Print.print;

public class AppTestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cash cash = Cash.FIVE_JIAO;
		print(cash);

		for (Cash c : Cash.values()) {
			print(c + ",ordinal:" + c.ordinal());
		}

		for (Cash a : Cash.values()) {
			switch (a) {
			case ONE_JIAO: {
				print(0.1);
				break;
			}
			case FIVE_JIAO: {
				print(0.5);
				break;
			}
			case TWO_JIAO: {
				print(0.2);
				break;
			}
			case ONE_YUAN: {
				print(1);
				break;
			}
			case FIVE_YUAN: {
				print(5);
				break;
			}
			case TEN_YUAN: {
				print(10);
				break;
			}
			default: {
				print(0);
			}
			}
		}
	}

}
