package chapter3.visibility;

/**
 * �����嵥3-3 �̰߳�ȫ�Ŀɱ�������
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
