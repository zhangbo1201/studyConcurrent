package Chapter4.Section1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest3 {
	public static void main(String[] args) throws InterruptedException{
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		System.out.println(executorService.isTerminated());
		for (int i = 0; i < 10; i++) {
			executorService.execute(new  MyRunnable1(" "+(i+1)+" "));
		}
		for (int i = 0; i < 10; i++) {
			executorService.execute(new  MyRunnable1(" "+(i+1)+" "));
		}
	}
}
