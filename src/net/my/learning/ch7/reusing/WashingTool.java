package net.my.learning.ch7.reusing;

/**
 * 第7章，练习2
 * 
 * @author qinbe
 *
 */
public class WashingTool extends Detergent {

	public WashingTool() {
		System.out.println(this);// 此时s已经被赋值
		append(" WashingTool");
	}

	public void scrub() {
		append(" WashingTool scrub()!");
	}

	public void sterilize() {
		append(" sterilize()");
	}

	public static void main(String[] args) {
		WashingTool wt = new WashingTool();
		wt.apply();
		wt.dilute();
		wt.scrub();
		wt.foam();
		wt.sterilize();
		System.out.println(wt);

	}

}
