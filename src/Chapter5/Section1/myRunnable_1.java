package Chapter5.Section1;

public class myRunnable_1 implements Runnable{

	private Userinfo userInfo;
	
	public myRunnable_1(Userinfo userInfo) {
		this.userInfo = userInfo;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		userInfo.setPassword("123456");
		userInfo.setUserName("zhangbo");
	}

}
