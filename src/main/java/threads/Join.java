package threads;

public class Join {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread();
		t1.setName("T1");
		MyThread t2 = new MyThread();
		t2.setName("T2");
		t1.start();
	//	t1.join();
		t2.start();
		t2.join();

	}

}


class MyThread extends Thread{
	
	public void run() {
		for(int i = 0; i < 500; i++) {
		System.out.println(Thread.currentThread().getName());
		}
	}
}