package synchronizedDemo0;


//为了证明Synchronized关键字锁的是对象，同一个对象会阻塞，不同对象不干扰。
public class SyncThread implements Runnable {

	private static int count;

	public SyncThread() {
		count = 0;
	}

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				try {
					System.out.println(Thread.currentThread().getName() + ":" + (count++));
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static int getCount() {
		return count;
	}

}
