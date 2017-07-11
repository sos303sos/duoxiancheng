package chapter3.visibility;

import java.util.HashSet;
import java.util.Set;

/**
 * 3-11 在可变对象基础上构建的不可变类
 * <q>解释:
 * <q>1.对象创建以后,状态就不能修改
 * <q>2.对象的所有域都是final类型
 * <q>3.对象是正确创建的(this没有溢出)
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
