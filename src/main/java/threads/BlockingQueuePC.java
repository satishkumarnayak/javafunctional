package threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueuePC {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
		
		Producer producerThread = new Producer(queue);
		Consumer consumerThread = new Consumer(queue);
		
		
		consumerThread.start();
	//	Thread.sleep(5000);
		producerThread.start();
		
		
		

	}

}

class Producer extends Thread {

	BlockingQueue<String> queue;

	public Producer(BlockingQueue<String> queue) {

		this.queue = queue;

	}

	public void run() {
		
		try {
			System.out.println("Producing Element 1");
			queue.put("Element 1");
			Thread.sleep(5000);
			System.out.println("Producing Element 2");
			queue.put("Element 2");
			Thread.sleep(5000);
			System.out.println("Producing Element 3");
			queue.put("Element 3");
			Thread.sleep(5000);
			System.out.println("Producing Element 4");
			queue.put("Element 4");
			Thread.sleep(5000);
			System.out.println("Producing Element 5");
			queue.put("Element 5");
			Thread.sleep(5000);
			System.out.println("Producing Element 6");
			queue.put("Element 6");
			Thread.sleep(5000);
			System.out.println("Producing Element 7");
			queue.put("Element 7");
			Thread.sleep(5000);
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

	}

}

class Consumer extends Thread {

	BlockingQueue<String> queue;

	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	public void run() {
		
		try {
			String take = null;
			while(true) {
			take = queue.take();
			System.out.println("Consumed:"+take);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}