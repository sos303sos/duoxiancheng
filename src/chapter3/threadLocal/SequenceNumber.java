package chapter3.threadLocal;

/**
 * ThreadLocal¿ÌΩ‚
 * @author 95129
 *
 */
public class SequenceNumber {
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
		public Integer initialValue() {
			return 0;
		}
	};
	private Integer seqNum1=0;

	public int getNextNum() {
		seqNum.set(seqNum.get() + 1);
		return seqNum.get();
	}
	public int getNextNum1() {
		return seqNum1++;
	}

	public static void main(String[] args) {
		SequenceNumber sn = new SequenceNumber();
		TestClient t1 = new TestClient(sn);
		TestClient t2 = new TestClient(sn);
		TestClient t3 = new TestClient(sn);
		t1.start();
		t2.start();
		t3.start();
	}

	private static class TestClient extends Thread {
		private SequenceNumber sn;

		public TestClient(SequenceNumber sn) {
			this.sn = sn;
		}

		public void run() {
			for (int i = 0; i < 3; i++) {
				System.out.println("thread[" + Thread.currentThread().getName() + "]sn[" + sn.getNextNum() + "]");
				System.out.println("thread[" + Thread.currentThread().getName() + "]------[" + sn.getNextNum1() + "]");
			}
		}
	}

}