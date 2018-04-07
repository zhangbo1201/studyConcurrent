package Chapter4.Section1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorTest4 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool(new MyexecutorFactoryTest1());
		executorService.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("我在运行"+Thread.currentThread().getName()+System.currentTimeMillis());
			}
		});
		executorService.shutdown();
	}
}
