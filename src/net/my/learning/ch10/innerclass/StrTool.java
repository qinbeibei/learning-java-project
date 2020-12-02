package net.my.learning.ch10.innerclass;

//练习2
public class StrTool {
	private String str;

	public StrTool(String s) {
		str = s;
	}

	public String toString() {
		return str;
	}

	public static void main(String[] args) {
		Sequence seqStr = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			seqStr.add(new StrTool("a" + i));
		}
		Selector selector = seqStr.getSelector();
		while (!selector.end()) {
			System.out.println(selector.current());
			selector.next();
		}
	}

}
