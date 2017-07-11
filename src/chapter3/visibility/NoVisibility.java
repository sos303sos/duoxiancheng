package chapter3.visibility;

/**
 * 程序清单3-1
 * <q>在没有同步的情况下共享变量(/(ㄒoㄒ)/~~)
 * 
 * <q>解释
 * <q>1.总共有两个线程,主线程main,ReaderThread线程
 * <q>2.主线程中可能存在重排序(Reordering)
 * <q>3.多线程可见性问题导致主线程和ReaderThread在各自cpu中的高速缓存对方都看不到
 * <q>可能的结果
 * <q>1.跳不出循环
 * <q>2.number值输出0
 * <q>3.number值输出为42
 */
public class NoVisibility {
	private static boolean ready;
	private static int number;

	private static class ReaderThread extends Thread {
		public void run() {
			while (!ready) {
				Thread.yield();
			}
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		new ReaderThread().start();
		number = 42;
		ready = true;
	}
}
