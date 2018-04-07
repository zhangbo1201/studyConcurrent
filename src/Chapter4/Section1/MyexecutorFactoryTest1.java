package Chapter4.Section1;

import java.util.concurrent.ThreadFactory;

public class MyexecutorFactoryTest1 implements ThreadFactory{

	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(r);
		thread.setName("定制名称： "+Math.random());
		return thread;
		
	}
	
}
