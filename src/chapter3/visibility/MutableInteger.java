package chapter3.visibility;

/**
 * �����嵥3-2 ���̰߳�ȫ�Ŀɱ�������
 * <q>���ڿɼ��Ե�����,�����߳�����setValue��,���߳̿���������ֵ(���ڿɼ�������,ֻ�ܿ���ʧЧֵ)
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
