package Chapter1;

public class classB extends Thread{
private SemaphoreTest1 semaphoreTest1; 
	
	public classB(SemaphoreTest1 semaphoreTest1){
		this.semaphoreTest1 = semaphoreTest1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		semaphoreTest1.testMethod();
	}
}
