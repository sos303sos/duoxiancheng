package chapter3.visibility;

/**
 * 程序清单3-3 线程安全的可变整数类
 * 
 * @author 95129
 *
 */
public class SynchronizedInteger {
	private int value;

	public synchronized int getValue() {
		return value;
	}

	public synchronized void setValue(int value) {
		this.value = value;
	}

}
