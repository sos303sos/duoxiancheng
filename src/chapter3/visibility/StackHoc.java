package chapter3.visibility;

import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 3-9基本类型的局部变量与引用变量的线程封闭性
 * 
 * @author 95129
 *
 */
public class StackHoc {
	public int loadTheArk(Collection<Animal> candidates) {
		SortedSet<Animal> animals;
		int numPairs = 0;
		Animal candidate = null;
		// animals被封闭在方法中,不要使它们溢出
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
