package Chapter5.Section1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainRun1 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable_1 callable_1 = new MyCallable_1(100);
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5l, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
		Future<String> future = executor.submit(callable_1);
		System.out.println("main A"+System.currentTimeMillis());
		System.out.println(future.get());
		System.out.println("main B"+System.currentTimeMillis());
	}
}
