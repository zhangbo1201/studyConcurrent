package Chapter5.Section1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainRun2 {
	public static void main(String[] args) {
		
		try {
			Userinfo userinfo = new Userinfo();
			userinfo.setUserName("sd");
			userinfo.setPassword("1");
			myRunnable_1 myRunnable_1 = new myRunnable_1(userinfo);
			ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
			Future<Userinfo> future =  executor.submit(myRunnable_1,userinfo);
			System.out.println("begain time:"+System.currentTimeMillis());
			
			userinfo =  future.get();
			System.out.println(userinfo.getPassword()+userinfo.getUserName());
			System.out.println("end time:"+System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
