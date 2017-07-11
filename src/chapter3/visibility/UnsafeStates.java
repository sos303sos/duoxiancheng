package chapter3.visibility;

/**
 * 程序清单3-6 使内部的可变状态溢出
 * <q>数组states已经溢出所在的作用域(意思就是调用者可以通过getStates来修改states)
 */
public class UnsafeStates {
	private String[] states = new String[] { "AK", "AL" };

	public String[] getStates() {
		return states;
	}
}
