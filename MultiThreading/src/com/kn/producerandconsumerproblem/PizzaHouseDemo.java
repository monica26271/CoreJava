package com.kn.producerandconsumerproblem;

public class PizzaHouseDemo {

	public static void main(String[] args) {
		PizzaHouse ph=new PizzaHouse();
		
		Producer p=new Producer(ph);
		Consumer c=new Consumer(ph);
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		t1.setName("ProducerThread");
		t2.setName("ConsumerThread");
		t1.start();
		t2.start();
	}

}
