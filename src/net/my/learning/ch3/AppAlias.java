package net.my.learning.ch3;

import static net.my.learning.util.Print.print;

public class AppAlias {

	// TODO
	public static void main(String[] args) {
		String s = "aaa";
		print(s);
		changeStr(s);
		print(s);// s没有改变

		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 1;
		t2.level = 2;
		print("t1.i=" + t1.level + ",t2.i=" + t2.level);
		t1 = t2;
		print("t1.i=" + t1.level + ",t2.i=" + t2.level);
		t1.level = 3;
		print("t1.i=" + t1.level + ",t2.i=" + t2.level);

		Score score = new Score();
		score.f = 47;
		print("score.f=" + score.f);
		PassObject.setScore(score);
		print("score.f=" + score.f);
		PassObject.setScoreObj(score);// score.f没有变成60
		print("score.f=" + score.f);
	}

	static void changeStr(String str) {
		str = "000";
	}

}

class Tank {
	int level;
}

class Score {
	float f;
}

class PassObject {
	static void setScore(Score score) {
		score.f = 100;
	}

	static void setScoreObj(Score score) {
		Score s = new Score();
		s.f = 60;
		score = s;
	}
}