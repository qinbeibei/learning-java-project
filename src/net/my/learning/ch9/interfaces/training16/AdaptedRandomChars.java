package net.my.learning.ch9.interfaces.training16;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class AdaptedRandomChars extends RandomChars implements Readable {
	private int count;

	public AdaptedRandomChars(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) {
			return -1;
		}
		String result = Character.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}

	//////////
	public static void main(String[] args) {
		Scanner s = new Scanner(new AdaptedRandomChars(10));
		while (s.hasNext()) {
			System.out.print(s.next() + " ");
		}
		s.close();
	}

}

class RandomChars {
	private static Random rand = new Random();

	public char next() {
		int min = 33;
		int max = 126;
		int s = rand.nextInt(max) % (max - min + 1) + min;
		return (char) s;
	}

}
