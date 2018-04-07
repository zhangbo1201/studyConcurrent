package Chapter4.Section1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest2 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("Run!!");
				}
			});
		}

	}
}
