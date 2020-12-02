package net.my.learning.ch10.innerclass;

//序列（数组），不用内部类的方式实现需求
public class Sequence2 implements Selector {
	private Object[] items;
	private int nextAdd = 0;
	private int nextRead = 0;

	// 构造方法
	public Sequence2(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		items[nextAdd] = x;
		nextAdd++;
	}

	// 内部类
	/*
	 * private class SequenceSelector implements Selector { private int i = 0;
	 * 
	 * @Override public boolean end() { return i == items.length; }
	 * 
	 * @Override public Object current() { return items[i]; }
	 * 
	 * @Override public void next() { if (i < items.length) { i++; }
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public Selector getSelector() { return new SequenceSelector(); }
	 */

	@Override
	public boolean end() {
		return nextRead == items.length;
	}

	@Override
	public Object current() {
		return items[nextRead];
	}

	@Override
	public void next() {
		if (nextRead < items.length) {
			nextRead++;
		}

	}

	public static void main(String[] args) {
		Sequence2 seq = new Sequence2(10);
		for (int i = 0; i < 10; i++) {
			seq.add(Integer.toString(i));
		}

		while (!seq.end()) {
			System.out.println(seq.current() + "");
			seq.next();
		}

	}

}
