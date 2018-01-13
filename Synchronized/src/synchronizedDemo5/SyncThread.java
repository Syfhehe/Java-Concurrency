package synchronizedDemo5;

//静态方法是属于类的而不属于对象的。同样的，synchronized修饰的静态方法锁定的是这个类的所有对象。
public class SyncThread implements Runnable {

	private static int count;

	public SyncThread() {
		count = 0;
	}

	public synchronized static void method() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + ":" + (count++));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public static int getCount() {
		return count;
	}

	@Override
	public void run() {
		method();
		
	}

}
