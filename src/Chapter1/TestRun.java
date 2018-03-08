package Chapter1;

public class TestRun {
	public static void main(String[] args) {
		SemaphoreTest1 semaphoreTest1 = new SemaphoreTest1();
		classA a = new classA(semaphoreTest1);
		a.setName("A");
		classB b = new classB(semaphoreTest1);
		b.setName("B");
		classC c = new classC(semaphoreTest1);
		c.setName("C");
		a.start();
		b.start();
		c.start();
	}

}
