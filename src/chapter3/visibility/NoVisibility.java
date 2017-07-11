package chapter3.visibility;

/**
 * �����嵥3-1
 * <q>��û��ͬ��������¹������(/(��o��)/~~)
 * 
 * <q>����
 * <q>1.�ܹ��������߳�,���߳�main,ReaderThread�߳�
 * <q>2.���߳��п��ܴ���������(Reordering)
 * <q>3.���߳̿ɼ������⵼�����̺߳�ReaderThread�ڸ���cpu�еĸ��ٻ���Է���������
 * <q>���ܵĽ��
 * <q>1.������ѭ��
 * <q>2.numberֵ���0
 * <q>3.numberֵ���Ϊ42
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
