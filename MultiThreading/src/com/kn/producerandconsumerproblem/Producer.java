package com.kn.producerandconsumerproblem;

public class Producer implements Runnable {
	PizzaHouse ph;
	int num=1;

	@Override
	public void run() {
		while(true) {
			ph.bake(num++);
		}
	}

	public Producer(PizzaHouse ph) {
		this.ph = ph;
	}
	

}
