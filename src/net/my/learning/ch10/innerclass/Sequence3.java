package net.my.learning.ch10.innerclass;

//序列（数组）
//练习22
public class Sequence3 {
	private Object[] items;
	private int next = 0;

	// 构造方法
	public Sequence3(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		items[next] = x;
		next++;
	}

	// 内部类SequenceSelector
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

	}

	private class ReverseSelector implements Selector {
		private int i = items.length - 1;

		@Override
		public boolean end() {
			return i == -1;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if (i >= 0) {
				i--;
			}

		}

	}

	// 正向遍历
	public Selector getSelector() {
		return new SequenceSelector();
	}

	// 反向遍历
	public Selector getReverseSelector() {
		return new ReverseSelector();
	}

	public static void main(String[] args) {
		Sequence3 seq = new Sequence3(10);
		// 给序列赋值
		for (int i = 0; i < 10; i++) {
			seq.add(Integer.toString(i));
		}

		Selector sel = seq.getSelector();
		while (!sel.end()) {
			System.out.print(sel.current() + " ");
			sel.next();
		}

		System.out.println();
		Selector sel_re = seq.getReverseSelector();
		while (!sel_re.end()) {
			System.out.print(sel_re.current() + " ");
			sel_re.next();
		}

	}

}
