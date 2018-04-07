package Chapter4.Section1;

public class MyRunnable1 implements Runnable{
	private String userName;
	
	public  MyRunnable1(String userName) {
		// TODO Auto-generated constructor stub
		super();
		this.userName = userName;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"userName="+userName+" begin "+System.currentTimeMillis());
		System.out.println(Thread.currentThread().getName()+"userName="+userName+" end "+System.currentTimeMillis());
		
	}
}
