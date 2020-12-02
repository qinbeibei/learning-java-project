package net.my.learning.ch10.innerclass;

//选择器接口
interface Selector {
	boolean end();// 是否结束

	Object current();// 获取当前

	void next();// 移动到下一个
}