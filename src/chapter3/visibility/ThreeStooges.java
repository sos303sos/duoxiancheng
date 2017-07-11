package chapter3.visibility;

import java.util.HashSet;
import java.util.Set;

/**
 * 3-11 �ڿɱ��������Ϲ����Ĳ��ɱ���
 * <q>����:
 * <q>1.���󴴽��Ժ�,״̬�Ͳ����޸�
 * <q>2.�������������final����
 * <q>3.��������ȷ������(thisû�����)
 */
public final class ThreeStooges {
	private final Set<String> stooges = new HashSet<String>();

	public ThreeStooges() {
		stooges.add("Moe");
		stooges.add("Larry");
		stooges.add("Curly");
	}

	public boolean isStooge(String name) {
		return stooges.contains(name);
	}
}
