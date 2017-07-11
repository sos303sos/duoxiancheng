package chapter3.visibility;

/**
 * 程序清单3-2 非线程安全的可变整数类
 * <q>由于可见性的问题,其他线程设置setValue后,本线程看不见最新值(由于可见性问题,只能看见失效值)
 * @author 95129
 *
 */
public class MutableInteger {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
