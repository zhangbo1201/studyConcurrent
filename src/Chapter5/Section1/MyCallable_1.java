package Chapter5.Section1;

import java.util.concurrent.Callable;

public class MyCallable_1 implements Callable<String>{
	private int age;

	public  MyCallable_1(int age) {
		super();
		this.age = age;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(8000);
		return "返回值 年龄是："+age;
	}
	
}
