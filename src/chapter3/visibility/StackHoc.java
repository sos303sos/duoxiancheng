package chapter3.visibility;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 3-9�������͵ľֲ����������ñ������̷߳����
 * 
 * @author 95129
 *
 */
public class StackHoc {
	public int loadTheArk(Collection<Animal> candidates) {
		SortedSet<Animal> animals;
		int numPairs = 0;
		Animal candidate = null;
		// animals������ڷ�����,��Ҫʹ�������
		animals = new TreeSet<Animal>();
		animals.addAll(candidates);
		for(Animal a:animals){
			//...
		}
		return numPairs;
	}

	class Animal {

	}
}
