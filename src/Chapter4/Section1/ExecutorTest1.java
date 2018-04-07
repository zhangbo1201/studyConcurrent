package Chapter4.Section1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程池创建工具类
 * @author Demon
 *
 */
public class ExecutorTest1 {
	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		executor.isShutdown();
		executor.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					System.out.println("Runnable1 begin" + System.currentTimeMillis());
					Thread.sleep(1000);
					System.out.println("A");
					System.out.println("Runnable1 end" + System.currentTimeMillis());
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		executor.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					System.out.println("Runnable2 begin" + System.currentTimeMillis());
					Thread.sleep(1000);
					System.out.println("B");
					System.out.println("Runnable2 end" + System.currentTimeMillis());
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
	}
}
