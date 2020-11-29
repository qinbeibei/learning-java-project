package net.my.learning.ch9.interfaces.interfaceprocessor;

public class AppTraining11 {

	public static void main(String[] args) {
		String s = "abcdefg";
		Apply.process(new FilterAdapter(new StringExchange()), s);
	}

}

abstract class Filter {
	public String name() {
		return this.getClass().getName();
	}

	public abstract String process(Object input);

}

class StringExchange extends Filter {
	public String process(Object input) {
		String s = (String) input;
		String res = "";
		for (int i = 0; i < s.length(); i = i + 2) {
			if (i == s.length() - 1) {
				res = res + s.substring(i, i + 1);
				break;
			}
			String temp1 = s.substring(i, i + 1);
			String temp2 = s.substring(i + 1, i + 2);
			res = res + temp2 + temp1;
		}
		return res;
	}
}

class FilterAdapter implements Processor {

	Filter filter;

	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}

	@Override
	public String name() {
		return filter.name();
	}

	@Override
	public String process(Object input) {
		return filter.process(input);
	}

}
