package chapter3.visibility;

/**
 * �����嵥3-6 ʹ�ڲ��Ŀɱ�״̬���
 * <q>����states�Ѿ�������ڵ�������(��˼���ǵ����߿���ͨ��getStates���޸�states)
 */
public class UnsafeStates {
	private String[] states = new String[] { "AK", "AL" };

	public String[] getStates() {
		return states;
	}
}
