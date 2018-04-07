package Chapter1;

/**
 * 线程同步测试方法
 */
import java.util.concurrent.Semaphore;

public class SemaphoreTest1 {
	//构造函数初始化semaphore类，1表示同时只允许一个线程允许acquire和release之间的内容
	private Semaphore semaphore = new Semaphore(1);
	public void testMethod(){
		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName()+" begin Time:"+System.currentTimeMillis());
			Thread.sleep(500);
			System.out.println(Thread.currentThread().getName()+ " end Time:"+System.currentTimeMillis());
			semaphore.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
