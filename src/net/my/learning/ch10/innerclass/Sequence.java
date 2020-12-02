package net.my.learning.ch10.innerclass;

//序列（数组）
public class Sequence {
	private Object[] items;
	private int next = 0;

	// 构造方法
	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		items[next] = x;
		next++;
	}

	// 内部类
	private class SequenceSelector implements Selector {
		private int i = 0;

		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if (i < items.length) {
				i++;
			}

		}

		public Sequence getOuterSeq() {
			return Sequence.this;
		}

	}

	public Selector getSelector() {
		return new SequenceSelector();
	}

	public void f() {
		System.out.println("test f()");
	}

	public static void main(String[] args) {
		Sequence seq = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			seq.add(Integer.toString(i));
		}

		Selector sel = seq.getSelector();
		while (!sel.end()) {
			System.out.println(sel.current() + "");
			sel.next();
		}

		///////// 练习4/////////
		System.out.println();
		Sequence seq2 = new Sequence(1);
		SequenceSelector sel2 = (SequenceSelector) seq2.getSelector();
		sel2.getOuterSeq().f();

	}

}
