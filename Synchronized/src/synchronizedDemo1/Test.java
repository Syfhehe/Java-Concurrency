package synchronizedDemo1;

/*
 * 上面代码中countAdd是一个synchronized的，
 * printCount是非synchronized的。
 * 从上面的结果中可以看出一个线程访问一个对象的synchronized代码块时，
 * 别的线程可以访问该对象的非synchronized代码块而不受阻塞。
 * */
public class Test {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread thread1 = new Thread(counter, "A");
		Thread thread2 = new Thread(counter, "B");
		thread1.start();
		thread2.start();
	}
}
