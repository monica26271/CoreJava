package com.kn.producerandconsumerproblem;

public class Consumer implements Runnable {
	PizzaHouse ph;

	@Override
	public void run() {
		while(true) {
			ph.eat();
		}
	}

	public Consumer(PizzaHouse ph) {
		this.ph = ph;
	}
	

}
