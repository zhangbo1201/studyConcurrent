package Chapter1;

public class classC extends Thread{
private SemaphoreTest1 semaphoreTest1; 
	
	public classC(SemaphoreTest1 semaphoreTest1){
		this.semaphoreTest1 = semaphoreTest1;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		semaphoreTest1.testMethod();
	}

}
